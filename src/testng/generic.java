package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic 
{
	public WebDriver driver;
	static{
		
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
	}
	@BeforeMethod
	public void openappln()
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://192.168.0.5:9002/");
	}
	@AfterMethod
	public void closeappln()
	{
		driver.quit();
	}
}
