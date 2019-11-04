package genericmethods;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
public void selectindex(WebElement ele,int i)
 {
	Select s=new Select(ele);
	s.selectByIndex(i);
 }
public void selectbyvalue(WebElement ele,String value) 
 {
	Select s=new Select(ele);
	s.selectByValue(value);
 }
public void selectbyvtext(WebElement ele,String text) 
 {
	Select s=new Select(ele);
	s.selectByVisibleText(text);
 }
public void deselectall(WebElement ele)
 {
	Select s=new Select(ele);
	s.deselectAll();
 }
public void deselectbyindex(WebElement ele,int i)
{
	Select s=new Select(ele);
	s.deselectByIndex(i);
}
public void deselectbyvalue(WebElement ele,String value)
{
	Select s=new Select(ele);
	s.deselectByValue(value);
}
public void deselectbyvtext(WebElement ele,String text)
{
	Select s=new Select(ele);
	s.deselectByVisibleText(text);
}
public int getselectedoptions(WebElement ele )
 {
	Select s=new Select(ele);
	List<WebElement> options = s.getAllSelectedOptions();
	int count = options.size();
	return count;
 }
public WebElement getfirstselectedoptions(WebElement ele )
{
	Select s=new Select(ele);
	WebElement option = s.getFirstSelectedOption();
	return option;
}
public void options(WebElement ele)
 {
	Select s=new Select(ele);
	List<WebElement> options = s.getOptions();
	int count = options.size();
	System.out.println(count);
	for (WebElement we : options)
	{
		String text=we.getText();
		System.out.println(text);
	}
 }
public boolean Imultiple(WebElement ele )
 {
	Select s=new Select(ele);
	boolean b = s.isMultiple();
	return b;
	
 }
	
	
 
}




