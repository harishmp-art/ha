package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook 
{
 @FindBy(id="email")
 private WebElement phoneno;
 @FindBy(id="pass")
 private WebElement pwd;
 @FindBy(id="loginbutton")
 private WebElement login;
 
 public facebook(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
	 
 }
 public void setusename(String name)
 {
	 phoneno.sendKeys("8050947566");
 }
 public void setpassword(String name)
 {
	 pwd.sendKeys("8050947566");
 }
 public void clicklogin()
 {
	 login.click();
 }
}
