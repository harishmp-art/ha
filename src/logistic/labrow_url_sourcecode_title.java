package logistic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class labrow_url_sourcecode_title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https:/www.google.com");
		String src = driver.getPageSource();
		System.out.println(src);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
	
	}

}
