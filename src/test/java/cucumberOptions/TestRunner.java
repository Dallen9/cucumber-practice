package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//feature file
//Tags allow you to only run testcases specify with the tag defined
@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/features", glue = "stepDefinitions",
        stepNotifications = true, tags = "@SmokeTest or @RegTest")
public class TestRunner {
}
