package testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctions.Common_Pro;
import PageObject.Item_select;
import PageObject.Login_Page_A;

public class Test_Login_Page extends Common_Pro{
	
	@Test(priority=0)
	public void login_test() throws InterruptedException, IOException {
		
		WebDriver driver= Common_Pro.launchbrowser();
		Login_Page_A page= new Login_Page_A(driver);
		page.performLogin(pro.getProperty("username"), pro.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void get_item_Name() throws InterruptedException, IOException {	
			
		WebDriver driver= Common_Pro.launchbrowser();
		Login_Page_A page= new Login_Page_A(driver);
		page.performLogin(pro.getProperty("username"), pro.getProperty("password"));
		
		Item_select sel= new Item_select(driver);
		
		String text=sel.gettex();
		System.out.println(text);
		Assert.assertEquals(text, "Sauce Labs Backpack");

}
}