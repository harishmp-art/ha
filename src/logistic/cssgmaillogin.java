package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssgmaillogin {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
		
			driver.findElement(By.cssSelector("input[type='email']")).sendKeys("saikrishna111.cm@gmail.com");//a#a is css selector
			driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("");
			driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();

	}

}
