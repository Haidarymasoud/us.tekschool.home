package RunnerPractice;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

@RunWith(Cucumber.class)
@CucumberOptions(
		//make sure when you type classpath:features, all letters are lower case
		features = "classpath:features",
		glue = "stepDefinitions",
		tags = "@LoginNA",
		dryRun = false,
		strict = true,
		monochrome = true,
		plugin = {
				"pretty",
				"html:target/site/cucumber-pretty",
				"json:target/cucumber.json"
		},
		publish = true
		)

public class TestRunner {
	
	@AfterClass
	public static void generateReport() {
		CucumberReportingConfig.reportConfig();
	}
	
}

