package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mock1 {

	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
	}
	@Test(priority=1, description="This is Launching process")
	public void Launching_Browser() 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test(priority=2, description="This is credential process")
    public void providing_Credentials() throws EncryptedDocumentException, IOException
    {
    	FileInputStream file= new FileInputStream("D:/orangehrm.xlsx");
    	Workbook wb = WorkbookFactory.create(file);
    	Sheet sheet = wb.getSheet("Sheet1");
    	String User=sheet.getRow(1).getCell(0).getStringCellValue();
    	String Pass=sheet.getRow(1).getCell(1).getStringCellValue();
    	
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(User);
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Pass);
    
    driver.findElement(By.xpath("//button[@type='submit']")).click();}
	
	
	
}
