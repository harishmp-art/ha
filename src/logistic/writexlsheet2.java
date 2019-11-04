package logistic;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import genericmethods.xlwrite_generic;

public class writexlsheet2
{
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
{
	System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.id("month"));
	
	WebElement ele1 = driver.findElement(By.id("year"));
	Select s = new Select(ele);
	Select s1 = new Select(ele1);
	List<WebElement> options = s.getOptions();
	
	List<WebElement> options1 = s1.getOptions();
	xlwrite_generic g=new xlwrite_generic ();
	String name="sheet2";
	Thread.sleep(3000);
	for (int i = 0; i < options.size(); i++) 
	{
		WebElement we = options.get(i);
		
		String text = we.getText();
		g.write(name, i, text);
		
	}
	Thread.sleep(3000);
	String sname="sheet3";
	for (int i = 0; i < options1.size(); i++) 
	{
		WebElement we = options1.get(i);
		
		String text = we.getText();
		g.write(sname, i, text);
		
	}
	
	
	
}
}
