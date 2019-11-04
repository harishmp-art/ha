package logistic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getidofallbrowsersandcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		
		Set<String> allwh = driver.getWindowHandles();
		int count=allwh.size();
		System.out.println(count);
		for (String s : allwh)
		{
		System.out.println(s);	
		}
	
	}

}
