package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class twitterlog {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://twitter.com/login");
		driver.findElement(By.xpath("//input[@placeholder='Phone, email or username']")).sendKeys("Harish mp");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("hari2456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
