package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "AllFeatureFile" }, glue = { "Steps" })
public class RunnerTest extends AbstractTestNGCucumberTests {

}
