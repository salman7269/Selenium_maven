package Revision_Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class apache_poi2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifocations");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123", Keys.ENTER);
	    driver.findElement(By.xpath("//*[text()='My Info']")).click();
	   
	    //fetching the data from excel sheet
	    FileInputStream file= new FileInputStream("D:/Sample_ApachePOI_Data.xlsx");
	    Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet1");
		Thread.sleep(2000);
		String firstname=sheet.getRow(2).getCell(0).getStringCellValue();
		String middlename=sheet.getRow(2).getCell(1).getStringCellValue();
		String lastname=sheet.getRow(2).getCell(2).getStringCellValue();
		int employeeids= (int) sheet.getRow(2).getCell(3).getNumericCellValue();
		String otherids=sheet.getRow(2).getCell(4).getStringCellValue();
		//String email=sheet.getRow(2).getCell(5).getStringCellValue();
		String nationality=sheet.getRow(2).getCell(6).getStringCellValue();
		String maritalStatus=sheet.getRow(2).getCell(7).getStringCellValue();
		String Nickname=sheet.getRow(2).getCell(8).getStringCellValue();
		String ExArmy=sheet.getRow(2).getCell(9).getStringCellValue();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='middleName']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(middlename);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(Nickname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys(Integer.toString(employeeids));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys(otherids);
		Thread.sleep(1000);
		Actions act= new Actions(driver);
       
		WebElement src=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div"));
		
		act.moveToElement(src).click().sendKeys(nationality).build().perform();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[10]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[10]")).sendKeys(ExArmy);
	
		
	WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", checkbox);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
