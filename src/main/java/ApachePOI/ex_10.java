package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_10 {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifocations");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		//reading the data from excelsheet
		FileInputStream file= new FileInputStream("D:/Sample_ApachePOI_Data.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int row=sheet.getLastRowNum();
		System.out.println("The Number of Rows:- "+row);
		for(int i=1; i<=row;i++)
		{XSSFRow rows= sheet.getRow(i);
			String First_name=rows.getCell(0).getStringCellValue();
			String Middle_Name=rows.getCell(1).getStringCellValue();
			String Last_Name=rows.getCell(2).getStringCellValue();
			String Nick_Name=rows.getCell(4).getStringCellValue();
			int EmployeeID= (int) sheet.getRow(1).getCell(5).getNumericCellValue();
			String ExArmy=rows.getCell(7).getStringCellValue();
			
			driver.findElement(By.xpath("//input[@name='personal[txtEmpFirstName]']")).clear();
			driver.findElement(By.xpath("//input[@name='personal[txtEmpFirstName]']")).sendKeys(First_name);
			driver.findElement(By.xpath("//input[@name='personal[txtEmpMiddleName]']")).clear();
			driver.findElement(By.xpath("//input[@name='personal[txtEmpMiddleName]']")).sendKeys(Middle_Name);
			driver.findElement(By.xpath("//input[@name='personal[txtEmpLastName]']")).clear();
			driver.findElement(By.xpath("//input[@name='personal[txtEmpLastName]']")).sendKeys(Last_Name);
			driver.findElement(By.xpath("//input[@name='personal[txtEmpNickName]']")).clear();
			driver.findElement(By.xpath("//input[@name='personal[txtEmpNickName]']")).sendKeys(Nick_Name);
			driver.findElement(By.xpath("//input[@name='personal[txtEmployeeId]']")).clear();
			driver.findElement(By.xpath("//input[@name='personal[txtEmployeeId]']")).sendKeys(String.valueOf(EmployeeID));
			driver.findElement(By.xpath("//input[@name='personal[txtMilitarySer]']")).clear();
			driver.findElement(By.xpath("//input[@id='personal_txtMilitarySer']")).sendKeys(ExArmy);
			
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Edit']")).click();
		}
		
	}
		
		
		
		
		
	}


