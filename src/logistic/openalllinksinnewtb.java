package logistic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class openalllinksinnewtb {

	private static int ArrayList;

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Harish/Desktop/link.html");
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		Thread.sleep(3000);
		int count=ele.size();
		System.out.println(count);
		Actions act=new Actions(driver);
		Robot r=new Robot();
		
		for (WebElement web : ele) 
		{
		 act.contextClick(web).perform();
		 r.keyPress(KeyEvent.VK_T);
		 r.keyRelease(KeyEvent.VK_T);
		}
		Thread.sleep(2000);
		Set<String> allwh=driver.getWindowHandles();
		int count1=allwh.size();
		System.out.println(count1);
		ArrayList<String> l= new ArrayList<String>(allwh);
		int count2=l.size();
		System.out.println(count2);
		String wh=l.get(3);
		Thread.sleep(3000);
		driver.switchTo().window(wh);
		
		
	}

}
