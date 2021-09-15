package starter;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = { "pretty", "json:target/cucumber-json-report.json","html:target/cucumber-html-report"}
)
public class CucumberTestSuite {}
