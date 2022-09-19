package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class softAssertion_in_TestNG {

	@Test
	public void facebookTITLEO()
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt = new FirefoxOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("https://www.facebook.com/");
		
		SoftAssert soft= new SoftAssert();
		String expTitle="Facebok ||Login";
		String actTitle=driver.getTitle(); 
		
	soft.assertEquals(actTitle, expTitle); //it should be fail,
	
String actAttribute=driver.findElement(By.xpath("//button[@name=\"login\"]")).getAttribute("name");
String expAttribute="lgin";	
	
soft.assertEquals(expAttribute, actAttribute, "Both expexted and actual attributes are matched successfully"); //it should be pass
soft.assertAll();
driver.close();
//in this test cases , we came to conclusion that in soft assertions if first assertion test will get failed it will not stop instead it
//will go for another test in the same method and finally it will generate the report of all the assertions in TESTNG report.

//while in case of hard assertion , if one assertion got failed it will not go further to check another assertions.
	}

	
	
	
}
