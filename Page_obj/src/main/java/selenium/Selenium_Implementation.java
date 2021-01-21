package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenium_Implementation implements Selenium_Interface {
	protected WebDriver driver=null;
	public void click( WebElement element) {
		
		element.click();
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	

}
