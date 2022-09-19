package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class softASSERTION {

	 @Test(priority=1)
		public void Login()
		{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.co.in");
		 String ActTitle=driver.getTitle();
		 String expTitle="Goooogle";
		 
		 SoftAssert soft = new SoftAssert();
		 soft.assertEquals(ActTitle, expTitle);
		 
		 driver.navigate().to("https://www.facebook.com");
		soft.assertAll();
		}
	    @Test
		public void logout()
			{
				System.out.println("Logout succesfull");
			}
	
	
	
}
