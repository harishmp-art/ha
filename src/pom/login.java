package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login //class name is always use as page name of the application
{
	//declaration
	@FindBy(xpath="//div[.='Login ']")
	private WebElement Login;
	//initialization
	public login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//utilization
	public void clicklogin()
	{
		Login.click();
	}
}
