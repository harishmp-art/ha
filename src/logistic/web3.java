package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class web3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Harish/Desktop/webele.html");
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		boolean b=ele.isEnabled();
		System.out.println(b);
		if(b)
		{
			System.out.println("text box is enabled");
		}
		else{
			System.out.println("text box is disabled");
		}	

	}

}
