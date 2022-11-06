package utility;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	public static ExtentReports createReport()
	{
		ExtentSparkReporter html = new ExtentSparkReporter("ExtentReport.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(html);
		reports.setSystemInfo("Type", "Regression");
		reports.setSystemInfo("Created By", "Nandkumar Kamble");
		return reports;
		
		
	}

}
