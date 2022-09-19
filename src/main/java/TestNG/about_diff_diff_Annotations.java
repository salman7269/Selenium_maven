							package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*following are the different diifferent annotations in TestNG:-
1)@Test:- used before every method as a test case, in this we can give priority also like @test(priority=1, description="This is first going to execute")
2)@BeforeTest:- It is used to execute firstly even before prioritized test cases also,
3)@AfterTest:- It is used to executed at last after all the testcases.
4)@BeforeMethod:-this annotation helps to execute the test case Before the execution the test cases of a particular method.
5)@AfterMethod:-this annotation helps to execute the test case After the execution the test cases of a particular method.
6)@BeforeClass:- This annotation helps to execute the test case Before the execution the test cases of a particular class.
7)@AfterClass:- This annotation helps to execute the test case After the execution the test cases of a particular class.
8)@DataProvider:-Marks a method as supplying data for a test method. The annotated method must return an Object[ ][ ], where each Object[ ] can be assigned the 
parameter list of the test method. The @Test method that wants to receive data from this DataProvider needs to use a dataProvider name equals to the name of this 
annotation.
9)@Factory:-Marks a method as a factory that returns objects that will be used by TestNG as Test classes. The method must return Object[ ].
10)@Listeners:-Defines listeners on a test class.

*/
public class about_diff_diff_Annotations {
    @BeforeTest
	public void Login()
	{
		System.out.println("First scenario is to LOGIN Successful ");
	}
    
    @AfterTest
	public void Logout()
	{
		System.out.println("Last Steps comes i.e. LOGOUT");
	}
	
    @BeforeMethod
    public void DATABASE()
    {
    	System.out.println("DATABASE CONNECTED successfully");
    }
    @AfterMethod
    public void Disconnect_DATABASE()
    {
    	System.out.println("DATABASE DISCONNECTED successfully");
    }
	@Test(priority=1, description="1st Step afte login")
	public void HomePage()
	{
		System.out.println("After login, HOMEPAGE will appear");
	}
	
	@Test(priority=2, description="2nd Step, after Login")
	public void SearchBOX()
	{
		System.out.println("Searching for product online");
	}
	
	
	
	
	

	}


