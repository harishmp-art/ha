package logistic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascriptexecutortoperformondisabledelement {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Harish/Desktop/disable.html");
		Thread.sleep(3000);
		//type casting
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("document.getElementbyId('t1').value='xyz'");

	}

}
