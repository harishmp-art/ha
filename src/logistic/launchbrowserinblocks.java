package logistic;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowserinblocks {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
			ChromeDriver driver=new ChromeDriver();
			driver.close();
			
		
	}
	static{
		String key="webdriver.chrome.driver";
		String value="./sw/chromedriver.exe";
		System.setProperty(key,value);
	}
}
