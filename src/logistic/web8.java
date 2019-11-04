package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class web8 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Harish/Desktop/webele.html");
		WebElement ele1 = driver.findElement(By.xpath("//input[@type='text'][1]"));
		 WebElement ele2 = driver.findElement(By.xpath("//input[@type='text'][2]"));
		 boolean b= ele1.isSelected();
		 ele1.sendKeys(Keys.CONTROL+"ac");
		 ele2.clear();
		 ele2.sendKeys(Keys.CONTROL+"v");
		
	}

}
