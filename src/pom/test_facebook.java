package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test_facebook 
{
@Test
	public void test()
	{
	System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/login/");
	facebook ip=new facebook(driver);
	ip.setusename("8050947566");
	ip.setpassword("24562456");
	ip.clicklogin();
	}
}
