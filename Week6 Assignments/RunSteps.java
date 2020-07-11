package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features/AllLeads.feature", glue = "steps", monochrome = true)
public class RunSteps extends AbstractTestNGCucumberTests {

}
