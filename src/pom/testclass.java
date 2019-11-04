package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testclass 
{
	@Test
	public void run() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		login ip = new login(driver);
		Thread.sleep(3000);
		ip.clicklogin();
		driver.navigate().refresh();
		Thread.sleep(3000);
		ip.clicklogin();
		Thread.sleep(3000);
		
		
	}
}
