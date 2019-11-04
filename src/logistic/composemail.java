package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class composemail {

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
		for (int i=1;i<=3;i++)
		{
		driver.findElement(By.xpath("(//div[.='Compose'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys("harishmp2456@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("hi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[.='Send'])[1]")).click();
		}
	}

}
