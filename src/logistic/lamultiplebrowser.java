package logistic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lamultiplebrowser {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String key1="webdriver.gecko.driver";
		String value1="./sw/geckodriver.exe";
		System.setProperty(key1,value1);
		FirefoxDriver driver1=new FirefoxDriver();
		
		String key="webdriver.chrome.driver";
		String value="./sw/chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver driver2=new ChromeDriver();
		
		driver1.close();
		driver2.close();
	}

}
