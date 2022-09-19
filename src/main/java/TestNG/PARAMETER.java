package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PARAMETER {

	WebDriver driver;
	
	@Parameters({"browser"})
	@Test(priority=1)
	public void Setup(String browser) {
		if(browser.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		
		}
		else if(browser.equals("firefox"))
	    {
			WebDriverManager.firefoxdriver().setup();
		    driver= new FirefoxDriver();	
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		
}
	
	@Parameters({"user","pass"})
	@Test(priority=2)
	public void login(String user, String pass) throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	}
	
	
}
