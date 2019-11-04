package logistic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tillcssselector {

	public static void main(String[] args) throws InterruptedException
	{
		String key="webdriver.gecko.driver";
		String value="./sw/geckodriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new FirefoxDriver();//FirefoxDriver driver=new FirefoxDriver();
		driver.get("url");//used to enter url
		String title=driver.getTitle();//to get title of the page
		String url=driver.getCurrentUrl();//to get url
		String src=driver.getPageSource();//to get source code
		Thread.sleep(3000);//sleep
		driver.close();//current tab
		//driver.quit();alltabs
		
		
	}

}
