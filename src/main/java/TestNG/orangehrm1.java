package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrm1 {
WebDriver driver;

@BeforeTest
public void setup()
{
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");
    driver = new ChromeDriver(opt);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

@Test(dataProvider= "loginData")
public void login(String username, String password) throws InterruptedException
{
	Thread.sleep(2000);
 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
 driver.findElement(By.xpath("//button[@type='submit']")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).isDisplayed());
Reporter.log("Login Test is passed", true);
}

@DataProvider()
public Object[][] loginData()
{
	Object[][] data= new Object[5][2];
	
	data[0][0]="Admin";
	data[0][1]="admin123";
	
	data[1][0]="salman";
	data[1][1]="admin123";
	
	data[2][0]="Admin";
	data[2][1]="Admin";
	
	data[3][0]=null;
	data[3][1]=null;
	return data;
}

@AfterTest()
public void logout() throws InterruptedException
{
	Thread.sleep(2000);
	WebElement ele1=driver.findElement(By.xpath("//li[@class='oxd-userdropdown']//following-sibling::span"));
	WebElement ele2= driver.findElement(By.xpath("//a[text()='Logout']"));
	Actions act = new Actions (driver);
	act.click(ele1).click(ele2).build().perform();
	
}
	
	
	
}
