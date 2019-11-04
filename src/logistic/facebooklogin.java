package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebooklogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("8050947566");
		driver.findElement(By.id("pass")).sendKeys("8050947566");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://www.facebook.com/")) 
		{
		System.out.println("home page is displayed");
		}
		else {
			System.out.println("home page is not displayed-fales");
		}
	}

}
//https://www.facebook.com/
////input[@type='submit']