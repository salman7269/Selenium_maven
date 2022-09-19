package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class disabling_testcase {
    @Test
	public void login() 
	{
		Reporter.log("LOGIN Succesfull", true);
	}
    @Test(enabled=false) //first approach to disable test case
	public void Search()
	{
		Reporter.log("Search is completed", true);
	}
    @Test
	public void logout()
	{
		Reporter.log("logout is succesfull", false);
		Assert.assertEquals(true, false);
	}
   
	
/*another approach we can exclude the method which we want to disable ,
from .xml file

 we can also disable the test method by including only those methods that
 we want to execute.   
 
 So there are three ways to disable the test methods or test case
 1)By providing the syntax 'enabled=false', with annotation
 2)By using excluding syntax in .xml file
 3)By including only those testcase that we want to execute.
  
 */
	
}
