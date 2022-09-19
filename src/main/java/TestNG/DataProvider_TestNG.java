package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_TestNG {
WebDriver driver;


@Test(dataProvider="logindata")
	public void LoginTest(String username, String password) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).isDisplayed());
		Reporter.log("Test is passed", true);
		Thread.sleep(4000);
		driver.quit();
	}
@DataProvider()
public Object[][] logindata()
{
	Object[][] data= new Object[3][2];
   
	//valid user and valid pass
	data[0][0]="Admin";    
    data[0][1]="admin123";
    
    //Invalid user and valid pass
    data[1][0]="Admns";
    data[1][1]="admin123";
    
    //Invalid user and Invalid pass
    
    data[2][0]="Admins";
    data[2][1]="amin231";		
	
    return data;
}


}
