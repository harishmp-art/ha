package logistic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileuploadnaukripopup
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		 Thread.sleep(3000);
		Set<String> allwh = driver.getWindowHandles();
		 Thread.sleep(3000);
		int count=allwh.size();
		System.out.println(count);
		allwh.remove(parentid);
		int count1=allwh.size();
		System.out.println(count1);
		for (String wh : allwh)
		{
		 driver.switchTo().window(wh);
		 String title=driver.getTitle();
		 System.out.println(title);
		 Thread.sleep(3000);
		 
		  driver.close();	
		
		}
		 Thread.sleep(3000);
		 driver.switchTo().window(parentid);
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='action-btn exp']")).click();
		WebElement ele=driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(3000);
		ele.sendKeys("C:\\Users\\Harish\\Desktop\\resume\\harish resume.docx");
	}

}
