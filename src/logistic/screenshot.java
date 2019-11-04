package logistic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMIlbGt1viT5QIVhxaPCh3ezwuXEAAYASAAEgJ4MvD_BwE&ef_id=EAIaIQobChMIlbGt1viT5QIVhxaPCh3ezwuXEAAYASAAEgJ4MvD_BwE:G:s&s_kwcid=AL!739!3!326505318642!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst= new File("E:\\flip.jpeg");
		FileUtils.copyFile(src, dst);
	}

}
