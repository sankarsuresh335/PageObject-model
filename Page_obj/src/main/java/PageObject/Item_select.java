package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Item_select {
	
	@FindBy(xpath="//*[contains(text(),'Sauce Labs Backpack')]")
	public static WebElement itembag;
	
	@FindBy(xpath="//*[contains(text(),'Sauce Labs Backpack')]")
	public static WebElement itemname;
	
	public Item_select(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public String gettex() {
		
		
		itembag.click();
		String text=itemname.getText();
		
		return text;
		
		
		
		
		
		
	}
}
