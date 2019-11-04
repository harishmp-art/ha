package logistic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class featchidstoreinlistandprint {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>();
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			String title=driver.getTitle();
			System.out.println(title);
			al.add(title);
		}
		//for assendig
		Collections.sort(al);
		for (String s : al)
		{
		 System.out.println(s);	
		}
		//for desending
		Collections.sort(al,Collections.reverseOrder());
		for (String st : al)
		{
		System.out.println(st);	
		}
	}

}
