package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmaillogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");

	
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("harishmp2456@gmail.com");//a#a is css selector
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8050947566");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://mail.google.com/mail/u/0/#inbox"))
		{
		System.out.println("home page is displayed");	
		}


	}

}
