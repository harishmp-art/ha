package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert extends generic
{
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		WebElement ele = driver.findElement(By.name("pwd"));//sendKeys("manager");
		//substring usage to pass only required values from string.
		
		String value = "harimanager";
		 String pwd = value.substring(4, 11);
		 System.out.println(pwd);
		 ele.sendKeys(pwd);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title, "actiTIME - Enter Time-Track");
		  SoftAssert sa = new SoftAssert();
		sa.assertEquals(title,"actiTIME - Enter Time-Track");
		
		System.out.println("1");
		sa.assertAll();
		System.out.println("2");
	}
}
