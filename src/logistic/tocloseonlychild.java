package logistic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tocloseonlychild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		Set<String> allwh = driver.getWindowHandles();
		int count=allwh.size();
		System.out.println(count);
		allwh.remove(parentid);
		int count1=allwh.size();
		System.out.println(count1);
		
		
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
