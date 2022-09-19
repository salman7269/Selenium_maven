package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_9 {

	public static void main(String[] args) throws IOException {

		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		FileInputStream file= new FileInputStream("D:/Sample_ApachePOI_Data.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
	   XSSFSheet sheet= workbook.getSheet("Sheet1");
	  int row=sheet.getLastRowNum();
		System.out.println("The number of rows are :- "+row);
		for(int i=2; i<=row; i++)
		{
			String Firstname=sheet.getRow(i).getCell(0).getStringCellValue();
			String Lastname=sheet.getRow(i).getCell(1).getStringCellValue();
			String Email=sheet.getRow(i).getCell(2).getStringCellValue();
			String Newpass=sheet.getRow(i).getCell(3).getStringCellValue();
			
		
		
		//create an FB account
		driver.findElement(By.linkText("Create New Account")).click();
		//filling information
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(Firstname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Lastname);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(Newpass);
		
		}
	}

}
