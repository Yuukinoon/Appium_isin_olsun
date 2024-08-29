package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        plugin = {"pretty","html:target/cucumber-html-report.html", "json:target/cucumber-json-report.json"},
        tags = "@regression or @smoke"


)
public class Runner {
}
