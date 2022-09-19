package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ganesh1 {
WebDriver driver;
	

    @Parameters({"browser"})
    @BeforeMethod
	public void setup(String browser)
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		}
			
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
	@Parameters({"user","pass"})
	@Test
	public void test1(String user, String pass) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	
	
	
	
	
}
