package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(dataProvider="LoginData")
	public void LOGIN(String user, String pass) throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.xpath("//*[text()='Employee List']"));
		Assert.assertTrue(ele.isDisplayed());
		Reporter.log("Login Test is Passed", true);
	
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@DataProvider
	public Object[][] LoginData() throws EncryptedDocumentException, IOException
	{
		Object[][] data=new Object[6][2];
		data[0][0]="amin";
		data[0][1]="admin123";
		
		data[1][0]="admin";
		data[1][1]="admin122";
		
		data[2][0]="Admin";
		data[2][1]="admin123";
		
		data[3][0]="amin";
		data[3][1]="amin";
		
		data[4][0]=null;
		data[4][1]=null;
		
		return data;
		
		
	}
	
	
}
