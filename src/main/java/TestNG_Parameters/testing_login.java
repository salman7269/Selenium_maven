package TestNG_Parameters;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing_login {
WebDriver driver;
	
    @BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@Parameters({"validUser","validPass"})
	@Test(priority=1)
	public void Login1(String validUser,String validPass ) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(validUser);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(validPass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	
	@AfterMethod
	public void info() throws NoSuchElementException
	{
		WebElement ele= driver.findElement(By.xpath("//*[text()='Employee List']"));
	if(ele.isDisplayed()==true)
	{
	Reporter.log("Login Test is Passed", true);
	driver.close();
	}
	else
	{
		Reporter.log("Login Test is Failed", true);
		driver.close();
	}
	
	}
	
	@Parameters({"InvalidUser","validPass"})
	@Test(priority=2)
	public void Login2(String InvalidUser, String validPass ) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(InvalidUser);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(validPass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Parameters({"validUser","InvalidPass"})
	@Test(priority=3)
	public void Login3(String validUser, String InvalidPass ) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(validUser);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(InvalidPass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Parameters({"InvalidUser","InvalidPass"})
	@Test(priority=4)
	public void Login4(String InvalidUser, String InvalidPass ) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(InvalidUser);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(InvalidPass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	
	
	
	
	
}
