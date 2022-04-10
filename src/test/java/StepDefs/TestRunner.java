package StepDefs;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/features",
		//tags = {"@Sanity,@Regression"},//OR condition to run scenarios
		tags = {"@Sanity,@Regression"},
		glue = {"StepDefs"}
		)
public class TestRunner {

}
