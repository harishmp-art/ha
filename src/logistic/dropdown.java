package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Harish/Desktop/drop.html");
		
		WebElement ele = driver.findElement(By.id("harish-biriyanni"));
		Select s=new Select(ele);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("t");
		Thread.sleep(2000);
		s.selectByVisibleText("idly");
	}

}
