package Window_handles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_4 {
public static void main(String[] args)
{
	WebDriverManager.firefoxdriver().setup();
	FirefoxOptions opt= new FirefoxOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver= new FirefoxDriver(opt);
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,300)");
	driver.findElement(By.xpath("//*[@id='windowButton']")).click();
	
	Set<String> windowids=driver.getWindowHandles();
	Iterator<String> it =windowids.iterator();
String parentwindow=it.next();
String childwindow=it.next();

driver.switchTo().window(childwindow);
System.out.println(driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText());
	
	
}
}
