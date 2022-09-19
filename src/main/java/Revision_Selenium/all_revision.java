package Revision_Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class all_revision {

	public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
FirefoxOptions opt= new FirefoxOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new FirefoxDriver(opt);
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.manage().window().maximize();

driver.findElement(By.className("wikipedia-search-input")).sendKeys("Nambi Narayanam", Keys.ENTER);
driver.findElement(By.xpath("//a[text()='Nambi Narayanan']")).click();
		
Set<String> windowids=driver.getWindowHandles();		
	Iterator<String> it=windowids.iterator();	
	String parentwindow=it.next();
	String childwindow=it.next();
driver.switchTo().window(childwindow);
WebElement text=driver.findElement(By.xpath(""));
	System.out.println("Text of Childwindow:- "+text);
String title=driver.getTitle();
System.out.println("Title of childwindow:- "+title);
	
driver.switchTo().window(parentwindow);
driver.findElement(By.className("wikipedia-search-input")).clear();
driver.findElement(By.className("wikipedia-search-input")).sendKeys("APJ Kalam", Keys.ENTER);

driver.findElement(By.xpath("//a[text()='APJ Kalam']")).click();
	}

}
