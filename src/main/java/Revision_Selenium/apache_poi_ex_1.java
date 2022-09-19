package Revision_Selenium;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class apache_poi_ex_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

WebDriverManager.chromedriver().setup();
ChromeOptions opt= new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new ChromeDriver(opt);

driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
//reading the data from excelsheet
FileInputStream file= new FileInputStream("D:/Facebook.xlsx");
Workbook workbook = WorkbookFactory.create(file);
Sheet sheet = workbook.getSheet("Sheet1");
String Firstname=sheet.getRow(3).getCell(0).getStringCellValue();	
String lastName=sheet.getRow(3).getCell(1).getStringCellValue();	
String email=sheet.getRow(3).getCell(2).getStringCellValue();	
int pass=(int) sheet.getRow(3).getCell(3).getNumericCellValue();

	
int day= (int) sheet.getRow(3).getCell(4).getNumericCellValue();
String month=sheet.getRow(3).getCell(5).getStringCellValue();
int year= (int) sheet.getRow(3).getCell(6).getNumericCellValue();

driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(Firstname);
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(email);
driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(Double.toString(pass));
driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys(Double.toString(day));
driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys(month);
driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys(Double.toString(year));
	
	}

}
