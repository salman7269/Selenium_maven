package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_provider2 {
	WebDriver driver;
	
@Test(dataProvider="LoginData")	
public void SauceDemo(String username, String password) throws InterruptedException
{
		
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
driver.get("https://www.saucedemo.com/");
Thread.sleep(2000);
driver.findElement(By.id("user-name")).sendKeys(username);
driver.findElement(By.id("password")).sendKeys(password);
driver.findElement(By.id("login-button")).click();
Thread.sleep(1000);
Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs Bolt')]")).isDisplayed());		
Reporter.log("Test Case Passed", true);
Thread.sleep(3000);
driver.quit();
}

@DataProvider
public Object[][] LoginData()
{
	Object[][] data= new Object[5][2];
	//valid user and valid pass
	data[0][0]="standard_user";
	data[0][1]="secret_sauce";
	
	//invalid user and valid pass
	data[1][0]="stan_user";
	data[1][1]="secret_sauce";
	
	//valid user and valid pass
	data[2][0]="locked_out_user";
	data[2][1]="secret_sauce";
	
	//valid user and invalid pass
	data[3][0]="problem_user";
	data[3][1]="secretsauce";
	
	//valid user and valid pass
	data[4][0]="performance_glitch_user";
	data[4][1]="secret_sauce";
	
	return data;
}

	
	
	
	
	
	
}
