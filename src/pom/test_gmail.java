package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test_gmail
{
	@Test
	public void test() throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2Fb%2F1%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F1%2FAddMailService&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	 gmail_login ip = new gmail_login(driver);
	ip.setusename("8050947566");
	ip.clicknext();
	Thread.sleep(3000);
	ip.setpassword("8050947566");
	ip.clicknext1();
	Thread.sleep(5000);
	compose_test ip1 = new compose_test(driver);
	ip1.clickcompose();
	Thread.sleep(3000);
	ip1.tofield("harishmp2456@gmail.com");
	ip1.sub("hi");
	Thread.sleep(3000);
	ip1.clicksend();
	}
}
