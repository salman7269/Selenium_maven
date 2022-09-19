package Window_handles;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipcart_addcart {

	public static void main(String[] args) throws AWTException, InterruptedException {
WebDriverManager.firefoxdriver().setup();
FirefoxOptions opt = new FirefoxOptions();
opt.addArguments("--disable-notifications");
WebDriver driver = new FirefoxDriver(opt);
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("flowers", Keys.ENTER);
driver.findElement(By.xpath("(//*[@class='CXW8mj _21_khk'])[3]")).click();
	
Set<String>windowids=driver.getWindowHandles();
System.out.println("Window IDs:- "+windowids);
Iterator<String> it=windowids.iterator();
String parentwindow=it.next();
String childwindow=it.next();

driver.switchTo().window(childwindow);
System.out.println(driver.findElement(By.xpath("//*[@class='_3_L3jD']")).getText());
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("450331", Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("//span[text()='View Details']")).click();
//WebElement trg =driver.findElement(By.xpath("//span[@class='YxlyDn']"));

//WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']"));
//ele.click();
//ele.sendKeys("450331", Keys.ENTER);
	}

}
