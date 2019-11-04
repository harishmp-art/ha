package logistic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class endtoendseleniumqc 
{

	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	driver.get("https://www.seleniumhq.org/");
	WebElement ele = driver.findElement(By.xpath("//a[.='Download']"));
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	Thread.sleep(3000);
	Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_T);
	 r.keyRelease(KeyEvent.VK_T);
	 Thread.sleep(3000);
	 Set<String> wh = driver.getWindowHandles();
	 for (String string : wh)
	 {
		driver.switchTo().window(string);
	}
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[.='3.141.59']")).click();
	 Thread.sleep(5000);
	 //Runtime.getRuntime().exec("C:\\Users\\Harish\\Desktop\\seleniumpoupsss.exe");
	 r.keyPress(KeyEvent.VK_TAB);
	 r.keyRelease(KeyEvent.VK_TAB);
	 	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	}

}
