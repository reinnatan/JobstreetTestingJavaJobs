package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "", features = "src/test/resources/features/BrowserJavaDeveloperJobsFind.feature", glue = "definitions", publish = true)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
