package test;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.SwagLabLogInPage;
import utility.BaseClass;
import utility.Reports;
@Listeners(utility.Listeners.class)
public class SwagLabLogInTest extends BaseClass{
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void configureTest() {
		reports = Reports.createReport();
	}
	
	@BeforeMethod
	public void launchBrowser()  {
	 driver = Browser.openBrowser();
	}
	@Test
	public void SwagLabLogInTestWithValidCredentials() {
		test = reports.createTest("SwagLabLogInTestWithValidCredentials");
		SwagLabLogInPage swagLabLogInPage = new SwagLabLogInPage(driver);
		swagLabLogInPage.enterUserName("standard_user");
		swagLabLogInPage.enterPassWord("secret_sauce");
		swagLabLogInPage.clickOnLogIn();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
	}
	
	@AfterMethod
	public void getTestResults(ITestResult result) {
		
		if (result.getStatus() == result.SUCCESS) {
		  test.log(Status.PASS, result.getName());
		}
		else if(result.getStatus() == result.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}
		else
		{
			test.log(Status.SKIP, result.getName());
		}
		
	}
	
	@AfterTest
	public void publishData() {
		reports.flush();
	}
	
	
	
	
	
	
	
	
	
	

}
