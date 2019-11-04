package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlemaps {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps/@12.9858993,77.5343223,15z");
		 WebElement sch = driver.findElement(By.xpath("//button[@id='searchbox-directions']"));
		 sch.click();
		 Thread.sleep(3000);
		 WebElement sch1 = driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']"));
		 sch1.sendKeys("hyderabad");
		 Thread.sleep(3000);
		 WebElement sch2 = driver.findElement(By.xpath("(//input[@role='combobox'])[3]"));
		 sch2.sendKeys("banglore");
		 WebElement sch3 = driver.findElement(By.xpath("(//button[@data-tooltip='Search'])[2]"));
		 sch3.click();
		 Thread.sleep(6000);
		 WebElement sch4 = driver.findElement(By.xpath("((//span[contains(.,'Fastest route')])[1]/ancestor::div[2]//span)[1]/ancestor::div[2]//div[2]"));
		 String x = sch4.getText();
		System.out.println(x);
	
	
	
	}

}
