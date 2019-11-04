package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingdoubleclick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.xpath("//a[.='Actimind Inc.']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.contextClick(link).perform();
	}

}
