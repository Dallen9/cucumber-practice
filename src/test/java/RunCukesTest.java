import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//feature file
//Tags allow you to only run testcases specify with the tag defined
//@RunWith(Cucumber.class)

@CucumberOptions( features = "src/test/resources/features", glue = "stepdefs",
        tags = "@MobileTest or @WebTest", plugin = {"pretty", "html:target/cucumber.html"})
public class RunCukesTest extends AbstractTestNGCucumberTests {
}
