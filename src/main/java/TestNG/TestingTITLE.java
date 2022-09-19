package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingTITLE {

	@Test
	public void EbayTITLE() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		String ExpectedTITLE="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String ActualTITLE=driver.getTitle();
		
		Assert.assertEquals(ActualTITLE, ExpectedTITLE);
		Thread.sleep(2000);
		driver.close();
	
	}
		

	

}
