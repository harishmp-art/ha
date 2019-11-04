package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssfacebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.cssSelector("input#email")).sendKeys("8050947566");//a#a is css selector
		driver.findElement(By.cssSelector("input#pass")).sendKeys("8050947566");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
