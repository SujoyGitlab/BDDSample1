package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//parallelFeatures//",
//		features = "src//test//resources//features//LoginIntoApp.feature",
		//features = "src//test//resources//features//Comments.feature",
		glue = {"stepDefs"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
//		"usage:target/Reports/usageReport",
//		"json:target/Reports/JsonReport.json",
//		"junit:target/Reports/JUnitReport.xml",
		"html:target/Reports/HtmlReport.html",
//		"rerun:target/failedScenarios.txt"
//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		)
public class GooglePageRunner {

}
