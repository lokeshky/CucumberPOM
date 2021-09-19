package runner;

import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		plugin= {"jason:target/RunCuke/cucumber.jason","pretty",
				"html:target/RunCuke/cucumber.html","com/cucumber.listener.ExtentCucumberFormatter"},
		features="src/test/resources/features",
		glue="steps",
		tags="@Search-Cars")
public class RunCuke extends AbstractTestNGCucumberTests {
	
	
	
	

}
