package logistic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clickonnthlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.faceboook.com/");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		links.get(45).click();
	}

}
