package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;
import steps.Hooks;

@CucumberOptions(
		features = "src/test/java/features",
		glue = "steps",
		monochrome = true,
		publish = true
		
		)
public class cucumberRunner extends Hooks{

}
