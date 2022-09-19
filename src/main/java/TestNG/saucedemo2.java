package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class saucedemo2 {
WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
	@Test(priority=1)
	public void Login1() throws InterruptedException
	{
		saucedemo login1=new saucedemo(driver);
		login1.username1();
		login1.password();
		Thread.sleep(2000);
		login1.login();
		Thread.sleep(3000);
		String expURL="https://www.saucedemo.com/inventory.html";
		String actURL=driver.getCurrentUrl();
		Assert.assertEquals(actURL, expURL);
	}
	@Test(priority=2)
	public void Login2() throws InterruptedException
	{
		saucedemo login2=new saucedemo(driver);
		login2.username2();
		login2.password();
		login2.login();
		Thread.sleep(2000);
		String expURL2="https://www.saucedemo.com/inventory.html";
		String actURL2=driver.getCurrentUrl();
		
		Assert.assertEquals(actURL2, expURL2);
		
	}
	@Test(priority=3)
	public void Login3() throws InterruptedException
	{
		saucedemo login3=new saucedemo(driver);
		login3.username3();
		login3.password();
		login3.login();
		Thread.sleep(2000);
		String expURL3="https://www.saucedemo.com/inventory.html";
		String actURL3=driver.getCurrentUrl();
		Assert.assertEquals(actURL3, expURL3);
		
	}
	@Test(priority=4)
	public void Login4() throws InterruptedException
	{
		saucedemo login4=new saucedemo(driver);
		login4.username4();
		login4.password();
		login4.login();
		Thread.sleep(2000);
		String expURL4="https://www.saucedemo.com/inventory.html";
		String actURL4=driver.getCurrentUrl();
		Assert.assertEquals(actURL4, expURL4);
	}
	
	
	


}
