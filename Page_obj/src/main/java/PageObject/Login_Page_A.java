package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.Selenium_Implementation;

public class Login_Page_A extends Selenium_Implementation {
	
	WebDriver driver=null;
	
	@FindBy(xpath="//*[@id='user-name']")
	public static WebElement username;
	
	@FindBy(xpath="//*[@id='password']")
	public static WebElement password;
	
	
	@FindBy(xpath="//*[@id='login-button']")
	public static WebElement submitButton;

	public Login_Page_A(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		super.setDriver(driver);
		
	}
	
	public void performLogin(String name, String pass) {
		
		username.sendKeys(name);
		password.sendKeys(pass);
		click(submitButton);
	}
		
	
	
	
	}



