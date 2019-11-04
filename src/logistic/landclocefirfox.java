package logistic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class landclocefirfox {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="./sw/geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver=new FirefoxDriver();
		driver.close();//used to close the current tab
		//driver.quit();is used to close entire browser
	}

}
