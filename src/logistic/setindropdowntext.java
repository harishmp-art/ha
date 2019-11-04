package logistic;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class setindropdowntext {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		//options consists of address of al options
		List<WebElement> options=s.getOptions();
		//to get in assending=TreeSet<String> tr=new TreeSet<String>();
		TreeSet<String> tr=new TreeSet<String>(Collections.reverseOrder());
		int count=options.size();
		System.out.println(count);
		for (WebElement we : options) 
		{
		  String text=we.getText();
		  tr.add(text);//add the inside an array
		}
		for(String t:tr)
		{
			System.out.println(t);
		}
		
	}

}
