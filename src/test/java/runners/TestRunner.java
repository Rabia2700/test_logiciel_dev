package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin = {"pretty",
        "html:target/cucumber-reports"},
        features = {"src/test/resources"},
        glue = {"steps","org/example/pageObjects"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
