package logistic;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class featchidandstoreinlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		int count=allwh.size();
		System.out.println(count);
		ArrayList<String> al=new ArrayList<String>();
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			System.out.println(wh);
			String title=driver.getTitle();
			System.out.println(title);
			al.add(title);
			al.addAll(allwh);
			int count1=al.size();
			System.out.println(count);
		}
	}

}
