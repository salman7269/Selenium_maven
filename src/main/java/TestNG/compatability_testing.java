package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class compatability_testing {

	//testing the multiple testcases one after the other
	
	
	@Test
	public void TC()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.get("https://wazirx.com/"); 
		driver.findElement(By.xpath("//span[text()='Log in']")).click(); 
		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("v123@gmail.com"); 
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Pass@23"); 
		driver.findElement(By.xpath("//span[text()='Login']")).click(); 
	}
	
	
	
	
	
}
