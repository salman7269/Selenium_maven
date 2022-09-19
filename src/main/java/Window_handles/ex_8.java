package Window_handles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt = new  FirefoxOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new FirefoxDriver(opt);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[text()='Top Deals']")).click();
	Set<String> windowids=	driver.getWindowHandles();
	Iterator <String> it=windowids.iterator();
	String parentwindow=it.next();
	String childwindow=it.next();
	
	
	driver.switchTo().window(childwindow);
	Thread.sleep(2000);
 int row=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/table/tbody/tr")).size();
 System.out.println("The number of rows:- "+ row);
 
 int column= driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/table/tbody/tr[1]/td")).size();
 System.out.println("The number of columns:- "+column);
		for(int i=2; i<=row; i++)
		{
			for(int j=1; j<=column; j++)
			{
			System.out.print(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"         ");
		}
		}
		Thread.sleep(3000);
		
		driver.switchTo().window(parentwindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Flight Booking']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
	
;	}

}
