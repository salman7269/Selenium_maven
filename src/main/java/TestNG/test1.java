package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	
	
//whenever we are executing two different methods at the same time it will execute in an alphabatical order.
	//like facebook executed first then google
	
	@Test
	public void googleTest()
	{
	   WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.co.in/");
			driver.findElement(By.name("q")).sendKeys("laal singh chaddha", Keys.ENTER);
			System.out.println(driver.getTitle());
			driver.quit();
	}
	
	@Test
	public void FacebookTest()
	{
	   WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("email")).sendKeys("sallu6268@gmail.com", Keys.ENTER);
			System.out.println(driver.getTitle());
			driver.quit();
	}
	

}
