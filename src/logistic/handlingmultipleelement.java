package logistic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingmultipleelement {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Harish/Desktop/sample.html");
		List<WebElement> dropdown = driver.findElements(By.xpath("//select|//table"));
		int count=dropdown.size();
		System.out.println(count);
		 List<WebElement> link = driver.findElements(By.tagName("a"));
		 int count2=link.size();
		 System.out.println(count2);
		 for (int i = 0; i < count2; i++) 
		 {
			WebElement we = link.get(i);
			String text = we.getText();
			System.out.println(text);
		}
		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count3=check.size();
		System.out.println(count3);
		for (int i = 0; i < count3; i++) 
		{
		 WebElement we1 = check.get(i);
		 we1.click();
		 Thread.sleep(2000);
		}
		for (int i =count3-1; i>=0; i--) 
		{
			WebElement we2 = check.get(i);
			we2.click();
			Thread.sleep(2000);
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
	
	}
	
}
