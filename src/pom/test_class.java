package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test_class
{
	@Test
	public void testing() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		Loginpage ip = new Loginpage(driver);
		ip.setusername("admin");
		Thread.sleep(3000);
		ip.setpassword("manager");
		Thread.sleep(3000);
		ip.clicklogin();
	}
}
