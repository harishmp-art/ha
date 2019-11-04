package logistic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookelementsinkannada {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		TreeSet<String> sr = new TreeSet<String>(Collections.reverseOrder());
		TreeSet<String>tr=new TreeSet<String>();
		int count=ele.size();
		System.out.println(count);
		for (WebElement we : ele) 
		{
		  String text=we.getText();
		
		tr.add(text);
		
		}
		
		for(String t:tr)
		{
			System.out.println(t);
		}
		

	}

}
