package logistic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class laubrowand_enterurl {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https:/www.google.com");
		
	}

}
