package starter.steps.web;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import starter.pages.Helper;
import starter.pages.web.RegisterPage;

public class HomeSteps extends Helper {
    public static final Dotenv dotenv = Dotenv.load();
    private static String expectedName = generateFirstNameFaker();

    @Given("user on home page")
    public void homePage() {
        webDriver.get(dotenv.get("WEB_BASE_URL"));
    }

    @And("user go to register form")
    public void tapLogginButton() {
        webDriver.findElement(By.xpath(RegisterPage.loggin_button)).click();
        webDriver.findElement(By.xpath(RegisterPage.register_button)).click();
    }

    @When("user register with valid data" )
    public void submitRegisterData(){
        webDriver.findElement(By.xpath(RegisterPage.register_first_name_field)).sendKeys(expectedName);
        webDriver.findElement(By.xpath(RegisterPage.register_last_name_field)).sendKeys(generateLastNameFaker());
        webDriver.findElement(By.xpath(RegisterPage.register_email_field)).sendKeys(generateEmailFaker());
        webDriver.findElement(By.xpath(RegisterPage.register_password_field)).sendKeys(dotenv.get("NEW_PASSWORD"));
        webDriver.findElement(By.xpath(RegisterPage.register_submit_register_button)).click();
    }

    @When("user has successfully registered" )
    public void validateSuccessfullyRegistered(){
        webDriver.findElement(By.cssSelector(RegisterPage.home_paga_account_button)).click();
        String actualName = webDriver.findElement(By.cssSelector(RegisterPage.account_name_text)).getText();
        actualName.equals(expectedName);
    }
}
