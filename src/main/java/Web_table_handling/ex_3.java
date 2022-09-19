package Web_table_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_3 {

	public static void main(String[] args) {
//getting data of all the columns and rows
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		int row=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("Number of rows are:- "+row);
	int column= driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td")).size();
	System.out.println("Number of columns are:- "+column);
	
	for(int i=2; i<=row;i++)
	{
		for(int j=1; j<=column;j++)
		{
			System.out.print(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+"         " );
		}
		
		System.out.println();
	}
	
	}

}
