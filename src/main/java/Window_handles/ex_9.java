package Window_handles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_9 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.firefoxdriver().setup();
FirefoxOptions opt= new FirefoxOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new FirefoxDriver(opt);
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[text()='Flight Booking']")).click();

Set<String>windowids=driver.getWindowHandles();
Iterator<String> it=windowids.iterator();
String parentwindow=it.next();
String childwindow=it.next();

driver.switchTo().window(childwindow);
WebElement ele=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
ele.click();
ele.sendKeys("pun");
Thread.sleep(2000);
WebElement ele1=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
ele1.click();
Thread.sleep(2000);
ele1.sendKeys("hy");
	}

}
