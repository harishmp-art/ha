package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handling_frames
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	driver.get("file:///C:/Users/Harish/Desktop/page.html");
	WebElement f = driver.findElement(By.xpath("//iframe[@id='f1']"));
	driver.findElement(By.id("t4")).sendKeys("123");
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("456");
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	driver.findElement(By.id("t3")).sendKeys("789");
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	driver.findElement(By.id("t4")).clear();
	Thread.sleep(3000);
	driver.findElement(By.id("t4")).sendKeys("return");
	Dimension d=new Dimension(300,400);
	driver.manage().window().setSize(d);
	Thread.sleep(3000);
	Point p=new Point(300,400);
	driver.manage().window().setPosition(p);
	Thread.sleep(3000);
	driver.manage().window().maximize();

	}

}
