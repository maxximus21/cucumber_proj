package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/cucumber_feature",
		glue = {"step_def","hooks"},
		dryRun = false ,
		monochrome = true ,
		plugin = {"pretty","html:report","json:report/jsonreport.json","junit:report/xmlreport.xml"} 
		//tags = {"@tag5"}
		)

public class runner_file {

}
