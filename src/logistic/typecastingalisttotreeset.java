package logistic;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class typecastingalisttotreeset {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Harish/Desktop/html%20samples/drop.html");
		
		WebElement ele = driver.findElement(By.id("harish-biriyanni"));
		Select s=new Select(ele);
		List<WebElement> options=s.getOptions();
		ArrayList<String>l=new ArrayList<String>();
		
		//to get in assending=TreeSet<String> tr=new TreeSet<String>(Collections.reverseOrder());
		int count=options.size();
		System.out.println(count);
		for (WebElement we : options) 
		{
		  String text=we.getText();
		  l.add(text);//add the inside an array and it will automatically delete duplicates
		}
		TreeSet<String> tr=new TreeSet<String>(l);
		for(String t:tr)
		{
			System.out.println(t);
		}
	

	}

}
