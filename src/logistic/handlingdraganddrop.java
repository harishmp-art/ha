package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingdraganddrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.dhtmlgoodies.com/submitted-script/i-google-like-draag");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[.='Men']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='T-Shirts']")).click();

	}

}
