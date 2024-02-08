package org.stepdefanition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

// Test
public class JVMReport {

	public static void jvmReportGeneration(String jsonpath) {
		File f = new File(System.getProperty("/Users/hemkumardevarajan/eclipse-workspaces/OI-DigitalTrains-Testings/Report/JVM Report"));
		Configuration c = new Configuration(f, "Digital Trains Application");
		c.addClassifications("JDK version", "1.8");
		c.addClassifications("Platfrom", "Mac OS");
		c.addClassifications("Selenium component", "WebDriver");
		c.addClassifications("Browser","Google Chrome");
		List<String> li = new ArrayList<String>();
		li.add(jsonpath);
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();

	}
}
