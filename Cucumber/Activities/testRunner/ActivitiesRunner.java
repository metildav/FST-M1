package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",
    glue = {"stepDefinitions"},
    tags = "@activity1_1",
    plugin = {"html:reports/HTML_Reports/report.html"},
    monochrome = true,
    publish = true
)
public class ActivitiesRunner {

}
