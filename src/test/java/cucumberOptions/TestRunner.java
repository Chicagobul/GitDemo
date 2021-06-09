package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature/Login.feature", glue = "stepDefinitions")

// To use cucumber with testNG you have to extend your class with AbstractTestNGCucumberTests

public class TestRunner extends AbstractTestNGCucumberTests
{

}
