package logistic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookdatedropdown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		//options consists of address of al options
		List<WebElement> options = s.getOptions();
		ArrayList<String> l= new ArrayList<String>();
		int count=options.size();
		System.out.println(count);
		for (WebElement we :options) 
		{
		 String text= we.getText();
		 l.add(text);
		}
		Collections.sort(l);//Collections.sort(l,Collections.reverseOrder());//to print reverse order
		for (String t :l)
		{
		 System.out.println(t);	
		}
		int count1=l.size();
		for (int i = count-1; i>=0; i--) //reverse the order
		{
		System.out.println(l.get(i));	
		}
	}

}
