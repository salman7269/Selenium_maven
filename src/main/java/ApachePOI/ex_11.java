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

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_11 {

	public static void main(String[] args) throws IOException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.switchTo().frame("frame-one1434677811");
		FileInputStream file= new FileInputStream("D://dummydata.xlsx/");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int row=sheet.getLastRowNum();
		
		for(int i=1;i<=1;i++)
		{
			XSSFRow rows=sheet.getRow(i);
			
		String Firstname=rows.getCell(0).getStringCellValue();
		String LastName=rows.getCell(2).getStringCellValue();
		String Email=rows.getCell(6).getStringCellValue();
		String Country=rows.getCell(5).getStringCellValue();
		String city=rows.getCell(4).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys(Firstname);
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-2']")).sendKeys(LastName);
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-6']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-4']")).sendKeys(Country);
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-5']")).sendKeys(city);
		

		}
		
		
		
		
	}

}
