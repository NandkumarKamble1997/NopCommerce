package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLogInPage {
	
	@FindBy (xpath = "//input[@id='user-name']") private WebElement user;
	@FindBy (xpath = "//input[@id='password']") private WebElement password;
	@FindBy (xpath = "//input[@id='login-button']") private WebElement logIn;
	
	public SwagLabLogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String name) {
		user.sendKeys(name);
	}
	
	public void enterPassWord(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogIn() {
		logIn.click();
	}

}
