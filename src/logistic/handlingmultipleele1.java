package logistic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingmultipleele1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Harish/Desktop/sample.html");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		int count=link.size();
		System.out.println(count);
		for (WebElement we : link) 
		{
		  String text = we.getText();
		  System.out.println(text);
		}
		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count1=check.size();
		System.out.println(count1);
		for (WebElement we1 : check)
		{
		we1.click();
		}
		for (int i = count1-1; i >=0; i--) 
		{
			WebElement we2=check.get(i);
			we2.click();
		}
		List<WebElement> tbox = driver.findElements(By.xpath("//input[@type='text']"));
		int count4=tbox.size();
		System.out.println(count4);
		for (int i = 0; i < count4; i++) 
		{
			WebElement we3 = tbox.get(i);
			we3.sendKeys("hello");
			Thread.sleep(2000);
			we3.clear();
			
		}
		List<WebElement> radio = driver.findElements(By.xpath("//select[@type='radio']"));
		int count5=radio.size();
		System.out.println(count5);
	}

}
