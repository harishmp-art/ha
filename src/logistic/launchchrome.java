package logistic;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchchrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="./sw/chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver driver=new ChromeDriver();
	}

}
