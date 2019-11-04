package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class compose_test 

{
	@FindBy(xpath="((//div[.='Compose'])[3]")
	private WebElement compose;
	@FindBy(xpath="//textarea[@name='to']")
	private WebElement to;
	@FindBy(xpath="//input[@placeholder='Subject']")
	private WebElement sub;
	@FindBy(xpath="//div[.='Send']")
	private WebElement send;
	public compose_test(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 
	 }
	public void clickcompose()
	{
		compose.click();
	}
	public void tofield(String value)
	{
		to.sendKeys(value);
	}
	public void sub(String value)
	{
		sub.sendKeys(value);
		
	}
	public void clicksend()
	{
		send.click();
	}
	
}
