package Revision_Selenium_06_08_2022;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandle2 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.naukri.com/");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[text()='Jobs']")).click();		
	
Set<String> windowids=driver.getWindowHandles();
Iterator<String> it=windowids.iterator();
String parentwindow=it.next();
String childwindow=it.next();

driver.switchTo().window(childwindow);
driver.findElement(By.xpath("//input[@name=\"qp\"]")).sendKeys("Software testing", Keys.ENTER);
driver.findElement(By.xpath("//input[@name=\"ql\"]")).sendKeys("Pune", Keys.ENTER);		
		

	}

}
