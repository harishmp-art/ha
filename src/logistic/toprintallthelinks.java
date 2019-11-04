package logistic;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class toprintallthelinks {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		int count=0;
		TreeSet<String> elink=new TreeSet<>();
		for (WebElement web : ele)
		{
			String links = web.getAttribute("href");
			
			if (links!=null) {
				elink.add(links);
			}
			
		}
		for (String s : elink) 
		{
	
			System.out.println(s);	
			count++;
		}
		System.out.println(count);
	}

}
