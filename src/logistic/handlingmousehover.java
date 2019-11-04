package logistic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingmousehover {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMIv-C8z6Xu5AIVkIWPCh3-0wODEAAYASAAEgJPbfD_BwE&ef_id=EAIaIQobChMIv-C8z6Xu5AIVkIWPCh3-0wODEAAYASAAEgJPbfD_BwE:G:s&s_kwcid=AL!739!3!326554955738!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//a[.='Login & Signup']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8050947566");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8050947566");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[.='Men']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='T-Shirts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-id='TSHFD2KTCKP6YWZR']")).click();
		Thread.sleep(3000);
		Set<String> wh=driver.getWindowHandles();
		for (String st: wh) 
		{
		 driver.switchTo().window(st);
		
		 
		}
		 Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='_3dqZjq'])[3]")).click();
	}

}
