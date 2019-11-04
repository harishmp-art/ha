package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmail_login
{
	@FindBy(id="identifierId")
	 private WebElement phoneno;
	@FindBy(xpath="(//span[.='Next'])[1]")
	private WebElement nxtbutton; 
	 @FindBy(xpath="//input[@name='password']")
	 private WebElement pwd;
	 @FindBy(xpath="(//span[.='Next'])[1]")
		private WebElement nxtbutton1; 
	
	 
	 public gmail_login(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 
	 }
	 public void setusename(String name)
	 {
		 phoneno.sendKeys("saikrishna111.cm@gmail.com");
	 }
	 public void clicknext()
	 {
		 nxtbutton.click();
	 }
	 public void setpassword(String name)
	 {
		 pwd.sendKeys("966653");
	 }
	 public void clicknext1()
	 {
		 nxtbutton1.click();
	 }
	 
}
