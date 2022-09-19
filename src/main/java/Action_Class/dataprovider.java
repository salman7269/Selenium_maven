package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority=2, dataProvider="LoginData")
	public void Login(String username, String password) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		WebElement ele=driver.findElement(By.xpath("//span[text()='Name (A to Z)']"));
		Assert.assertTrue(ele.isDisplayed());
		Reporter.log("Test is passed",true);
		
		driver.quit();
	}
	
	@DataProvider
	public Object[][] LoginData()
	{
		Object[][] data= new Object[5][2];
		data[0][0]="standard_user"; //it should be pass
		data[0][1]="secret_sauce";
		
		data[1][0]="secret_sauc"; //it should be fail
		data[1][1]="secret_sauce";
		
		data[2][0]="locked_out_user"; // it should be pass
		data[2][1]="secret_sauce";
		
		data[3][0]="problem_user"; //it should be pass
		data[3][1]="secret_sauce";
				
		return data;
	}
	
	
	
	
	
	
	
	
}
