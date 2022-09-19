package Revision_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class softassertionTestNG {

	
	@Test
	public void titleTEST() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.primevideo.com/");
		String expTitle="Welcome to Prime Video";
		String acTITLE=driver.getTitle();
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(acTITLE, acTITLE);
	}
   @Test
	public void ElementTest() {
	   WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.primevideo.com/");
	   boolean ele=driver.findElement(By.xpath("//input[@type='search']")).isDisplayed();
	   SoftAssert softassert= new SoftAssert();
	   softassert.assertFalse(ele);
	   
   }





}

