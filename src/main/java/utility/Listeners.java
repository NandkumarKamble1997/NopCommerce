package utility;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listeners extends BaseClass implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println();
	}
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println();
	}
	public void onTestFailure(ITestResult result)
	{
		try {
			ScreenShot.takeScreenShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println();
	}

}
