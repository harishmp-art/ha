package logistic;

import java.io.IOException;
import java.util.List;
import java.util.TreeSet;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import genericmethods.xlwrite_generic;

public class writeinxl 
{

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		xlwrite_generic g=new xlwrite_generic ();
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		String name="sheet1";
			int count = 0;
			for (WebElement value: ele) 
			{	
				count++;
				
				String links = value.getAttribute("href");
				
			for(int i=0;i<count;i++)
			{
				g.write(name,i, links);
			
			}
			}
			
	}

}
