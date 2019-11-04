package logistic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingrightclickactionandopenlink {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.xpath("//a[.='Actimind Inc.']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.contextClick(link).perform();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
	}

}
