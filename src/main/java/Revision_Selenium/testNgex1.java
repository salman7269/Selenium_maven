package Revision_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNgex1 {
@Test
	public void titleTEST() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.primevideo.com/");
		String expTitle="Welcome to Prime Video";
		String acTITLE=driver.getTitle();
		
		Assert.assertEquals(acTITLE, expTitle);
	
	}
	
		
	}


