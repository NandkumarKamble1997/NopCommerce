package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabProductPage {
	
	
	@FindBy (xpath = "//button[@id='react-burger-menu-btn']") private WebElement menu;
	@FindBy (xpath = "//select[@class='product_sort_container']") private WebElement filter;
	@FindBy (xpath = "//a[@class='shopping_cart_link']") private WebElement shoppingCart;
	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement addToCart ;
	@FindBy (xpath = "//button[@id='remove-sauce-labs-backpack']") private WebElement remove;
	@FindBy (xpath = "//a[@id='inventory_sidebar_link']") private WebElement allItem;
	@FindBy (xpath = "//a[@id='about_sidebar_link']") private WebElement about;
	@FindBy (xpath = "//a[@id='logout_sidebar_link']") private WebElement  logOut;
	@FindBy (xpath = "//a[@id='reset_sidebar_link']") private WebElement reset;
	@FindBy (xpath = "//a[ text()  = 'Twitter']") private WebElement twitter;
	@FindBy (xpath = "//a[ text()  = 'Facebook']") private WebElement faceBook;
	@FindBy (xpath = "//a[ text()  = 'Linkedin']") private WebElement linkedIn;
	
	
   public SwagLabProductPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
   
   
	
}
