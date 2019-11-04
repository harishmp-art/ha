package logistic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class multidrop1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Harish/Desktop/drop.html");
		
		WebElement ele = driver.findElement(By.id("harish-biriyanni"));
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByValue("g");
		s.selectByVisibleText("rasam");
		boolean b = s.isMultiple();
		System.out.println(b);
		if (b) 
		{
		 System.out.println("muti select");	
		 //s.deselectAll();
		}
		else {
			System.out.println("single select");
		}
//to count only selected options
		List<WebElement> options = s.getAllSelectedOptions();
		int count=options.size();
		System.out.println(count);
		
	}

}
