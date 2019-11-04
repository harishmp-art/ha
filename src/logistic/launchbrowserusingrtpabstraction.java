package logistic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchbrowserusingrtpabstraction
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		//rtp&abstraction
		WebDriver driver=new FirefoxDriver();
		driver.close();
	}

}
