package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testng1 {
    @Test
	public void Regression()
	{
		System.out.println("regression successful");
		Reporter.log("regression");
	}
    @Test(priority=2)
	public void Functional()
	{
		Reporter.log("functional successfull", true);
	}
	
	
	
	
	
}
