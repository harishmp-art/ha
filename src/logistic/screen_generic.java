package logistic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screen_generic 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		screen_generic.getphoto(driver);
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMIlbGt1viT5QIVhxaPCh3ezwuXEAAYASAAEgJ4MvD_BwE&ef_id=EAIaIQobChMIlbGt1viT5QIVhxaPCh3ezwuXEAAYASAAEgJ4MvD_BwE:G:s&s_kwcid=AL!739!3!326505318642!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
		driver.findElements(By.xpath("//a"));
		screen_generic.getphoto(driver);
	}
	public static void getphoto(WebDriver driver) throws IOException
	{
		
		String photos="./photos/";
		Date d=new Date();
		String D1=d.toString();
		String date=D1.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photos+date+".jpeg");
		FileUtils.copyFile(src, dst);
	}
}
