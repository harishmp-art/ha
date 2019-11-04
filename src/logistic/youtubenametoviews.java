package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtubenametoviews {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("sye Raa Trailer");
		driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/watch?v=KyhrrdpA2YA']")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("(//yt-formatted-string[contains(.,'Sye Raa Trailer (Telugu)')])[1]/ancestor::div[1]//span[1]"));
		String count = ele.getText();
	System.out.println(count);
	}

}
