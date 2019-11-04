package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatorid {

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 driver.get("file:///C:/Users/Harish/Desktop/html.html");//url
	 driver.findElement(By.id("a1")).click();//to find element

	}

}
