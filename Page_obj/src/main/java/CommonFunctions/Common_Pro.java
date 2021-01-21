package CommonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Common_Pro {
	
	public static Properties pro=null;
	public static WebDriver driver=null;
	
	public static Properties loadPropertyfile() throws IOException {
		
		FileInputStream file= new FileInputStream("E:\\Selenium wrkspace\\Page_obj\\config.properties");
		pro= new Properties();
		pro.load(file);
		return pro;
		
	}
	
	
	public static WebDriver launchbrowser() throws IOException {
		
		loadPropertyfile();
		String url=pro.getProperty("url");
		String browser=pro.getProperty("browser");
		
		System.out.println("hi i am there ");
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","E:\\Selenium wrkspace\\Page_obj\\target\\chromedriver.exe");
			driver=new ChromeDriver();		
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver","E:\\Selenium wrkspace\\Page_obj\\chromedriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		}
	
	
	@AfterSuite
	public void Teardown() {
		
		driver.quit();
	}

}
