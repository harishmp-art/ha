package logistic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class launfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String key="webdriver.gecko.driver";
String value="./sw/geckodriver.exe";
System.setProperty(key,value);
FirefoxDriver driver=new FirefoxDriver();
	}

}
