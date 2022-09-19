package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groups_inTESTNG {
    @BeforeTest
	public void Setup()
	{
		System.out.println("Setup Successfull");
	}
	@Test(priority=1,groups="Regression")
	public void login()
	{
		System.out.println("Login Successfull");
	}
	@Test(priority=2,groups="Functional")
	public void Homepage()
	{
		System.out.println("Homepage appear Successfull");
	}
	@Test(priority=3,groups="Functional")
	public void Search()
	{
		System.out.println("Search Successfull");
	}
	@Test(priority=4,groups="Functional")
	public void Buying()
	{
		System.out.println("Buying product ");
	}
	@Test(priority=5,groups="Functional")
	public void Payment()
	{
		System.out.println("Payment Successfull");
	}
	@AfterTest
	public void Logout()
	{
		System.out.println("Logout Successfull");
	}
	
	
}
