package Revision_Selenium_06_08_2022;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		//get method
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//a[text()=\"Flight Booking\"]")).click();
	Set<String> windowids=driver.getWindowHandles();
	Iterator<String> it=windowids.iterator();
	String Parentwindow=it.next();
	String childwindow=it.next();
	
	driver.switchTo().window(childwindow);
	Select se= new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")));
	se.selectByVisibleText("Bhopal (BHO)");
	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	//span[@class='pax-add pax-enabled'])[1]
			driver.findElement(By.xpath("(//span[@class='pax-add pax-enabled'])[1]")).click();
	driver.findElement(By.xpath("(//span[@class='pax-add pax-enabled'])[1]")).click();
	driver.findElement(By.xpath("(//span[@class='pax-add pax-enabled'])[1]")).click();
	driver.findElement(By.xpath("(//span[@class='pax-add pax-enabled'])[2]")).click();
	driver.findElement(By.xpath("(//span[@class='pax-add pax-enabled'])[2]")).click();
	driver.findElement(By.xpath("(//span[@class='pax-add pax-enabled'])[3]")).click();
	driver.findElement(By.xpath("(//span[@class='pax-add pax-enabled'])[3]")).click();
	driver.switchTo().window(Parentwindow);
	
	driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
	
	
	
	}

}
