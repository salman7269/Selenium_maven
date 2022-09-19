package TestNG;

import org.testng.annotations.Test;

public class Grouping_Testcases {
    @Test(groups="regression")
	public void Login() {
	System.out.println("Enter valid username");
	System.out.println("Enter valid password");
	System.out.println("Login successful");

	}
	@Test(groups="Logout")
	public void Logout()
	{
		System.out.println("Click on logOut Button");
		System.out.println("Logout successful");
	}

}
