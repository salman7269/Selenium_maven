package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProviderClass2 {
WebDriver driver;
	

@BeforeMethod
public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://www.testyou.in/Login.aspx");
	}

@AfterMethod
public void TearDown()
{
	driver.quit();
}

@Test(dataProvider="testlogindata", dataProviderClass=dataProviderClass.class)
public void TestLogin(String user, String pass) throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@id,'_txtUserLogin')]")).sendKeys(user);
	driver.findElement(By.xpath("//input[contains(@id,'_txtPassword')]")).sendKeys(pass);
}
	
	
	
	
}
