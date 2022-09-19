package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//In case of hardassertion , if we are providing two assertion cases, and if first assertion failed then it will not go for another assertion 
//but in case of soft assertion, it will execute all the assertion doesn't matter which is passed and which is failed.

public class HardAssertion {
@Test
	public void facebookTITLEO()
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt = new FirefoxOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("https://www.facebook.com/");
		
		String expTitle="Facebok ||Login";
		String actTitle=driver.getTitle(); 
		
	Assert.assertEquals(actTitle, expTitle); //it should be fail,
	
String actAttribute=driver.findElement(By.xpath("//button[@name=\"login\"]")).getAttribute("name");
String expAttribute="login";	
	
Assert.assertEquals(expAttribute, actAttribute, "Both expexted and actual attributes are matched successfully"); //it should be pass

driver.close();
//in this test cases , we came to conclusion that in hard assertions if first assertion test will get failed then because of that next assertion will not execute.
	}

}
