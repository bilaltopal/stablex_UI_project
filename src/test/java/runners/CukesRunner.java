package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * The CukesRunner class is the main test runner class for executing Cucumber scenarios.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/rerun.txt" },
		features = "src/test/resources/features", glue = "stepdefinitions", tags = "@btc", dryRun = false)

public class CukesRunner {

}