package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4
{
@Test(priority=1,invocationCount=3)
public void test1()
{
	Reporter.log("2", true);
}
@Test
public void test2()
{
Reporter.log("2",true);	
}
}
