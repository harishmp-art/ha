package logistic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import genericmethods.Dropdown;
import genericmethods.Webelements;

public class facebookloginscreenshot
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504236057%7Ce%7Cfacebook%27%7C&placement=&creative=318504236057&keyword=facebook%27&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-362360550869%26loc_physical_ms%3D9062010%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI9fKGloqU5QIVig4rCh0DiQ4uEAAYASAAEgK9bPD_BwE");
		WebElement ele = driver.findElement(By.xpath("//input[@id='u_0_n']"));
		String value="hari";
		String value1="mp";
		String value2="8050947566";
		String value3="hari2456";
		Webelements wee=new Webelements();
		wee.sendkey(ele, value);
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='u_0_p']"));
		wee.sendkey(ele1, value1);
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='u_0_s']"));
		wee.sendkey(ele2, value2);
		WebElement ele3 = driver.findElement(By.xpath("//input[@id='u_0_z']"));
		wee.sendkey(ele3, value3);
		WebElement ele4 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Dropdown drop=new Dropdown();
		String text="8";
		drop.selectbyvtext(ele4, text);
		WebElement ele5 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		String text1="Dec";
		drop.selectbyvtext(ele5, text1);
		WebElement ele6 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		String text2="1991";
		drop.selectbyvtext(ele6, text2);
		WebElement ele7=driver.findElement(By.xpath("//label[.='Male']"));
		wee.toclick(ele7);
		WebElement ele8 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		wee.toclick(ele8);
		Thread.sleep(5000);
		
		screen_generic screen=new screen_generic();
		screen.getphoto(driver);
		
		
	
	
	
	}

}
