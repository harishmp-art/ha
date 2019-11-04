package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class web6 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Harish/Desktop/webele.html");
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(3000);	
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(3000);
		ele.sendKeys(Keys.DELETE);
	}

}
