package logistic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class web9 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		WebElement ele=driver.findElement(By.xpath("//a[.='Download']"));
		String tooltip=ele.getAttribute("title");
		System.out.println(tooltip);
		String text = ele.getText();
		System.out.println(text);
		WebElement ele1 = driver.findElement(By.xpath("//a[.='Documentation']"));
		Point loc = ele1.getLocation();
		System.out.println(loc);
		String font = ele1.getCssValue("font-size");
		System.out.println(font);
		WebElement ele3=driver.findElement(By.xpath("//a[.='Support']"));
		int h = ele3.getSize().getHeight();
		System.out.println(h);
		int j = ele3.getSize().getWidth();
		System.out.println(j);
		String tex = ele3.getText();
		System.out.println(tex);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
