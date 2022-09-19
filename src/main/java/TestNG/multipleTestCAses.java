package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class multipleTestCAses {
@BeforeMethod
public void setup()
	{
		System.out.println("setup done");
	}
	
@BeforeTest //used to  disable the testcase
public void logintest()
{
	System.out.println("Login Successful");
}
@BeforeSuite
public void search()
{
	System.out.println("Search Complete");
}

public void logout() {
	System.out.println("Logout successful");
}
	
}
