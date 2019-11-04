package logistic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import genericmethods.Webdriver_generic;
import genericmethods.Webelements;

public class gmailenetoend_using_generic {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
		//WebElement ele = driver.findElement(By.xpath("(//a[@title='Create an account'])[1]"));
		Webelements wee=new Webelements();
		//wee.toclick(ele);
		Webdriver_generic wd=new Webdriver_generic ();
		wd.switchto(driver);
		String value="Harish";
		WebElement ele1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		wee.sendkey(ele1, value);
		WebElement ele2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		String value1="MP";
		wee.sendkey(ele2, value1);
		String value2="harimp08121991";
		WebElement ele3 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		wee.sendkey(ele3, value2);
		WebElement ele4 = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		String value3="8050947566";
		wee.sendkey(ele4, value3);
		WebElement ele5 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		wee.sendkey(ele5, value3);
		WebElement ele6 = driver.findElement(By.xpath("(//span[.='Next'])[1]"));
		wee.toclick(ele6);
		WebElement ele7 = driver.findElement(By.xpath("//input[@type='tel']"));
		wee.sendkey(ele7, value3);
		WebElement ele8 = driver.findElement(By.xpath("(//span[.='Next'])[1]"));
		wee.toclick(ele8);
		Thread.sleep(3000);
		
		screen_generic screen=new screen_generic();
		screen.getphoto(driver);
		
		
		
		
		
		
		
	}

}
