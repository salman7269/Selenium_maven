package TestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeHRM {
	
WebDriver driver;

@BeforeTest
public void Setup() throws IOException
{
	WebDriverManager.firefoxdriver().setup();
    driver= new FirefoxDriver();
    Reporter.log("Setup success", true);
}



@BeforeMethod
public void LaunchAPP()
{
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Reporter.log("App launched successfully", true);

}


@Parameters({"username","pass"})
@Test(priority=1)
public void Login(String username, String pass) throws InterruptedException 
{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}

@Test(priority=2)
public void MyInfoPanel() 
{
	driver.findElement(By.xpath("//*[text()='My Info']")).click();
	
	Reporter.log("Login successful", true);
}
@AfterMethod
public void close()
{
	driver.close();
	Reporter.log("Browser closed successfully", true);
}


@AfterTest
public void end()
{
	Reporter.log("Test is completed", true);
}

	
}
