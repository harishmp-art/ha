package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
	@FindBy(id="username")
	private WebElement untbox;
	
	@FindBy(name="pwd")
	private WebElement pwdtbox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	
	public Loginpage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	public void setusername(String un)
	{
		untbox.sendKeys(un);
	}
	public void setpassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	public void clicklogin()
	{
		login.click();
	}
	
}
