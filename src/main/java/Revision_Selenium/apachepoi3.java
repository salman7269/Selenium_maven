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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Shaikh Salman
 *
 */
public class apachepoi3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

driver.switchTo().frame("frame-one1434677811");
FileInputStream file= new FileInputStream("D://dummydata.xlsx/");
Workbook workbook = WorkbookFactory.create(file);
Sheet sheet = workbook.getSheet("Sheet1");
String Firstname=sheet.getRow(1).getCell(0).getStringCellValue();
//String middlename=sheet.getRow(1).getCell(1).getStringCellValue();
String lastname=sheet.getRow(1).getCell(2).getStringCellValue();
int phone=(int) sheet.getRow(1).getCell(3).getNumericCellValue();
String city=sheet.getRow(1).getCell(4).getStringCellValue();
String country=sheet.getRow(1).getCell(5).getStringCellValue();
String email=sheet.getRow(1).getCell(6).getStringCellValue();

driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys(Firstname);

driver.findElement(By.xpath("//input[@name='RESULT_TextField-2']")).sendKeys(lastname);
driver.findElement(By.xpath("//input[@name='RESULT_TextField-6']")).sendKeys(email);
driver.findElement(By.xpath("//input[@name='RESULT_TextField-4']")).sendKeys(country);
driver.findElement(By.xpath("//input[@name='RESULT_TextField-5']")).sendKeys(city);
driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys(Integer.toString(phone));
JavascriptExecutor js=(JavascriptExecutor) driver;
WebElement ele=driver.findElement(By.xpath("//input[@type='radio']"));
js.executeScript("arguments[0].click();", ele);
Thread.sleep(2000);



driver.findElement(By.xpath("(//input[@name='RESULT_CheckBox-8'])[2]"));
driver.findElement(By.xpath("(//input[@name='RESULT_CheckBox-8'])[3]"));
driver.findElement(By.xpath("(//input[@name='RESULT_CheckBox-8'])[4]"));
driver.findElement(By.xpath("(//input[@name='RESULT_CheckBox-8'])[5]"));
driver.findElement(By.xpath("(//input[@name='RESULT_CheckBox-8'])[1]"));

Select se= new Select(driver.findElement(By.xpath("//select[@name='RESULT_RadioButton-9']")));
se.selectByVisibleText("Evening");
driver.findElement(By.xpath("//input[@name='Submit']")).click();

	}

}
