package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class clickonthirdproduct 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMIv-C8z6Xu5AIVkIWPCh3-0wODEAAYASAAEgJPbfD_BwE&ef_id=EAIaIQobChMIv-C8z6Xu5AIVkIWPCh3-0wODEAAYASAAEgJPbfD_BwE:G:s&s_kwcid=AL!739!3!326554955738!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/account/login?ret=/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8050947566");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8050947566");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[.='Baby & Kids']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Soft Toys']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img)[8]")).click();

	}

}
