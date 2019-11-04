package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Harish/Desktop/linktext.html");
		driver.findElement(By.cssSelector("a#a1"));//a#a is css selector
	}

}
