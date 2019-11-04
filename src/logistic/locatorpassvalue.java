package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatorpassvalue {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Harish/Desktop/html.html");
		driver.findElement(By.tagName("input")).sendKeys("harish");

	}

}
