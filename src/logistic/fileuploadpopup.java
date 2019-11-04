package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileuploadpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Harish/Desktop/fileuploadpopup.html");
		WebElement ele=driver.findElement(By.id("uploadfile"));
		Thread.sleep(3000);
		ele.sendKeys("C:\\Users\\Harish\\Desktop\\resume\\resume 1.docx");
	}

}
