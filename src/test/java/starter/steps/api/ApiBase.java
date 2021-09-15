package starter.steps.api;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import starter.TestInstrument;
import utils.BDDStyleMethod;

public class ApiBase {

    BDDStyleMethod bddStyleMethod;
    TestInstrument testInstrument;

    @When("^automation api system set (start|finish)$")
    public void setIsDweb(String state) {
        if (state.equals("start")){
            testInstrument.setWeb(false);
        } else if (state.equals("finish")){
            testInstrument.setWeb(true);
        }

    }

    @When("^client orders api to do GET to \"([^\"]*)\"$")
    public void clientSendsAGETRequestTo(String pathUrl) {
        bddStyleMethod.doGetRequest(pathUrl);
    }

    @When("^client orders api to do DELETE to \"([^\"]*)\"$")
    public void clientSendsADELETERequestTo(String pathUrl) {
        bddStyleMethod.deleteEndpoint(pathUrl);
    }

    @Then("^the return from api status must be \"([^\"]*)\"$")
    public void responseStatusShouldBe(String status) {
        bddStyleMethod.getResponseCode(status);
    }

    @Then("client saves data \"([^\"]*)\" to variable \"([^\"]*)\"$")
    public void collectValue(String field, String var) {
        bddStyleMethod.setVariable(field, var);
    }

    @And("return for field \"([^\"]*)\" data type must be \"([^\"]*)\"$")
    public void validateDataType(String field, String dataType) throws Throwable {
        bddStyleMethod.validateDataType(field, dataType);
    }

    @And("the return must have a field \"([^\"]*)\"$")
    public void validateShouldHave(String field) throws Throwable {
        bddStyleMethod.validateShouldHave(field);
    }

    @And("response should have \"([^\"]*)\" matching \"([^\"]*)\"$")
    public void validateToMatchingValue(String field, String value) {
        bddStyleMethod.validateToMatchingValue(field, value);
    }

    @And("response should have \"([^\"]*)\" containing \"([^\"]*)\"$")
    public void validateToContainingValue(String field, String value) {
        bddStyleMethod.validateToContainingValue(field, value);
    }
}
