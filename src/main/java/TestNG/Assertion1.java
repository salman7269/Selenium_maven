package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion1 {

	 @Test(priority=1)
		public void Login()
		{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.co.in");
		 String ActTitle=driver.getTitle();
		 String expTitle="Goooogle";
		 
		 
		 Assert.assertEquals(ActTitle, expTitle);//
		 
		 driver.navigate().to("https://www.facebook.com");//it will not execute because condition will stop at line23 only.
		
		}
	    @Test
		public void logout()
			{
				System.out.println("Logout succesfull");
			}
	
		/*
		 If test class consist of multiple @Test methods, and in One of the Test Method 
Multiple verification are preferred and While executing one of verification 
failed then rest of the verification will not be verified and testNG will execute 
next method by failing verification filed method. 
		 */
	
	
	
	
	
}
