package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class enetoendmyntra {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com/?gclid=EAIaIQobChMInNHQve_65AIVjIaPCh3hygKrEAAYASAAEgLkQPD_BwE&utm_source=google&utm_medium=cpc&utm_campaign=&utm_term=myntra&utm_content=&matchtype=e");
		WebElement ele=driver.findElement(By.xpath("//span[.='Profile']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='log in']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8050947566");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8050947566");
		
		
		
	}

}
