package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingalertpopup 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[.='Cal']")).click();
		Thread.sleep(3000);
		//select the date
		driver.findElement(By.xpath("(//a[.='28'])[1]")).click();

	}

}
