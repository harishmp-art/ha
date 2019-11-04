package logistic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowncount {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Harish/Desktop/html%20samples/drop.html");
		
		WebElement ele = driver.findElement(By.id("harish-biriyanni"));
		Select s=new Select(ele);
		//options consists of address of al options
		List<WebElement> options = s.getOptions();
		List<String> list1=new ArrayList<String>();//to generalise collection we use <> and to create new arry list.
		int count = options.size();
		System.out.println(count);
		s.deselectAll();
		Thread.sleep(3000);
		for (int i = 0; i < count; i++) {
			s.selectByIndex(i);
		}
		Thread.sleep(2000);
		//to get the values of all the options
		for (WebElement we : options) 
		{
				list1.add(we.getText());//assigning the values to list 
				Thread.sleep(2000);
		}
			List<String>temp=list1;
			Collections.sort(temp);
		System.out.println(temp);
		
	
	}

}
