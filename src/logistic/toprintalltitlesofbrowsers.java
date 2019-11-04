package logistic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class toprintalltitlesofbrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		for (String s : allwh) 
		{
		driver.switchTo().window(s);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.close();
		}
		
	}

}
