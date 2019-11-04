package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testng.generic;

public class softassert1 extends generic 
{
	@Test
	public void login() throws InterruptedException
	{
		WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));
		//substring usage to pass only required values from string.
		
		String value = "HARISHA MP";
		String lower = value.toLowerCase();
		ele.sendKeys(lower);
		//String pwd = value.substring(4, 11);
		// System.out.println(pwd);
		Thread.sleep(3000);
		
		String pwd1="abcdef";
		String b="";
		char[]d=pwd1.toCharArray();
		 for (int i = 0; i< d.length; i++)
		 {

            
             if (65 <= d[i] && d[i]<=90)
             {
                 b =b+d[i];  
             }

             
		 }
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(b);
	}
		 
}
