package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		if (title.equals("actiTIME - Enter Time-Track")) 
		{
		System.out.println("home page is displayed-pass");	
		}
		else {
			System.out.println("home page not displayed-faill");
		}
		
		
	}

}
