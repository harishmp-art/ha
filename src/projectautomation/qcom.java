package projectautomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testng.generic;

public class qcom extends generic
{
	@Test
	public void testing()
	{
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	
	}
}
