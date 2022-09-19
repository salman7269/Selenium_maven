package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_driven_framework_SBI_maturity_value {
//points to remember
	//1) SendKeys(123654) //not allowed
	//2)SendKeys(String.valueOf(12366)) allows
	//String to integer --->integer.parseInt()
    //String to double----->double.parseDouble()	
	
	
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		

	
	
		FileInputStream file= new FileInputStream("D:/Maturity Value.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		
		for(int i=1; i<=rows; i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			XSSFCell principlecell=row.getCell(0);
			int princ=(int) principlecell.getNumericCellValue();
			
			
			XSSFCell roi=row.getCell(1);
			int rateofinterest=(int)roi.getNumericCellValue();
			
			XSSFCell period=row.getCell(2);
			int periods=(int) period.getNumericCellValue();
			
			XSSFCell freq=row.getCell(3);
			String frequency=freq.getStringCellValue();
			
			XSSFCell expMV=row.getCell(4);
			int expMaturityValue=(int) expMV.getNumericCellValue();
		
	   String actMaturityValue =driver.findElement(By.xpath("//*[@id='resp_matval']")).getText();
		
		Select tenure= new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		tenure.selectByVisibleText("year(s)");
		
		Select Freq=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
		Freq.selectByVisibleText("Simple Interest");
	   driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
	   driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateofinterest));
	   driver.findElement(By.xpath("//*[@id='tenure']")).sendKeys(String.valueOf(periods));
	   driver.findElement(By.xpath("//*[@onclick='return getfdMatVal(this);']")).click();
	   driver.findElement(By.xpath("//img[@class='PL5']")).clear();
	   if(Double.parseDouble(actMaturityValue)==expMaturityValue)
	   {
		   System.out.println("Test Is PASSED");
	   }
	   
	   else {
		   System.out.println("Test Is FAILED");
	   }
		
	   
	   
		}
		
		driver.quit();
		
		
		
	}

}
