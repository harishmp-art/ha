package logistic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class openlintandopennewtab {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		WebElement w1 = driver.findElement(By.xpath("//a[.='Projects']"));
		WebElement w2 = driver.findElement(By.xpath("//a[.='Download']"));
		WebElement w3 = driver.findElement(By.xpath("(//a[.='Documentation'])[1]"));
		WebElement w4 = driver.findElement(By.xpath("(//a[.='Support'])[1]"));
		WebElement w5 = driver.findElement(By.xpath("//a[.='About']"));
		ArrayList<WebElement>l=new ArrayList<WebElement>();
		l.add(w1);
		l.add(w2);
		l.add(w3);
		l.add(w4);
		l.add(w5);
		Actions act=new Actions(driver);
		Robot r=new Robot();
		for (WebElement t : l) 
		{
			act.contextClick(t).perform();
			 r.keyPress(KeyEvent.VK_T);
			 r.keyRelease(KeyEvent.VK_T);	
		}
		
		Thread.sleep(2000);
		Set<String> allwh=driver.getWindowHandles();
		int count1=allwh.size();
		System.out.println(count1);
		ArrayList<String> l1= new ArrayList<String>(allwh);
		int count2=l1.size();
		System.out.println(count2);
		String wh=l1.get(2);
		Thread.sleep(3000);
		driver.switchTo().window(wh);
		
		driver.findElement(By.xpath("//td[.='C#']/../td[4]/a")).click();
		
		 r.keyPress(KeyEvent.VK_ALT);

		 r.keyPress(KeyEvent.VK_S);
		 r.keyRelease(KeyEvent.VK_ALT);	
		 r.keyRelease(KeyEvent.VK_S);
		 Thread.sleep(3000);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
	}

}
