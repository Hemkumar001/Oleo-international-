package org.testrunner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefanition.JVMReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features ="/Users/hemkumardevarajan/eclipse-workspaces/OI-DigitalTrains-Testings/src/test/resources", 
glue = "org.stepdefanition", dryRun =false, monochrome =true, strict = true, snippets = SnippetType.UNDERSCORE,tags ="@Regression",
plugin = {
		"pretty","html:/Users/hemkumardevarajan/eclipse-workspaces/OI-DigitalTrains-Testings/Report/Html.report",
		"junit:/Users/hemkumardevarajan/eclipse-workspaces/OI-DigitalTrains-Testings/Report/xmlreport.xml",
		"json:/Users/hemkumardevarajan/eclipse-workspaces/OI-DigitalTrains-Testings/Report/jsonreport.json",
	
})


public class OleoTestRunnerClass {

	@AfterClass
	public static void report() {
		
		JVMReport.jvmReportGeneration(System.getProperty("/Users/hemkumardevarajan/eclipse-workspaces/OI-DigitalTrains-Testings/Report/jsonreport.json"));

	}
}



//@sanity @Regression @smoke

