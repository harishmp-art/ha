package logistic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class naukrilogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		for (int i = 0; i < 10; i++)
		{
			
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
		driver.findElement(By.xpath("(//div[.='Login'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chethan3344@gmail.com");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("dravid3344");
		driver.findElement(By.xpath("//button[@value='Login']")).click();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//div[.='My Naukri']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Edit Profile']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//em[.='Edit']")).click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='mob_number']"));
		Thread.sleep(3000);
		
		 ele1.clear();
		 Thread.sleep(3000);
		 ele1.sendKeys("9535404516");
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='saveBasicDetailsBtn']")).click();
		WebElement ele2=driver.findElement(By.xpath("//div[.='My Naukri']"));
		Thread.sleep(3000);
		Actions act1=new Actions(driver);
		act1.moveToElement(ele2).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='logout-gnb']")).click();
		
		
	}

		
	}

}
