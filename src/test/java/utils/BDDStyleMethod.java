package utils;

import io.github.cdimascio.dotenv.Dotenv;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import static org.hamcrest.Matchers.*;

public class BDDStyleMethod {
    public static final Dotenv dotenv = Dotenv.load();
    private static ValidatableResponse json;
    static HashMap<String, String> vars = new HashMap<String, String>();
    public static HashMap<String, String> theHeaders = new HashMap<String, String>();
    public static String baseUrl = dotenv.get("API_BASE_URL");
    public static Response response;

    @Step
    public static void doGetRequest(String endpoint) {
        RestAssured.defaultParser = Parser.JSON;
        System.out.println("Endpoint : " + baseUrl + endpoint);

        json = SerenityRest.given().headers(theHeaders).
                when().get(baseUrl + endpoint).
                prettyPeek().
                then().contentType(ContentType.JSON);
        response = json.extract().response();
    }

    @Step
    public static void deleteEndpoint (String pathUrl) {
        System.out.println("Endpoint : " + baseUrl + pathUrl);
        json = SerenityRest.given()
                .headers(theHeaders)
                .when().delete(baseUrl + pathUrl)
                .prettyPeek()
                .then().statusCode(200);
    }

    @Step
    public static void getResponseCode(String status) {
        switch (status) {
            case "OK": status = "200"; break;
            case "Created": status = "201"; break;
            case "Not Found": status = "404"; break;
            case "Bad Request": status = "400"; break;
            case "Unauthorized": status = "401"; break;
            case "Unprocessable Entity": status = "422"; break;
            case "Internal Server Error": status = "500"; break;
        }

        json.assertThat().statusCode(Integer.parseInt(status));
    }

    @Step
    public static void setVariable(String json_path, final String newVars) {
        System.out.print(newVars + " : ");
        String value = response.jsonPath().getString(json_path);
        BDDStyleMethod.vars.put(newVars, value);
        System.out.print(value + "\n");
    }

    @Step
    public static void validateToMatchingValue(String field, String value) {
        json.assertThat().body(field, hasToString(value));
    }

    @Step
    public static void validateToContainingValue(String field, String value) {
        json.assertThat().body(field, containsString(value));
    }

    @Step
    public static void validateDataType(String field, String dataType) throws Exception {
        Object value = json.extract().path(field);
        String[] actualDataType = (((Object)value).getClass().getName()).split("\\.");

        if (actualDataType[actualDataType.length-1].equals(dataType)) {
            return;
        } else {
            throw new Exception(field + "\nexpected : " + dataType + ", actual : " + actualDataType[actualDataType.length-1]);
        }
    }

    @Step
    public static void validateShouldHave(String field) throws Exception{
        Object value = json.extract().path(field);
        if (value != null) {
            return;
        } else {
            throw new Exception(field + " not available!");
        }
    }

}
