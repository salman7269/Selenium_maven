import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle_1 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeOptions opt= new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver = new ChromeDriver(opt);

driver.get("https://demoqa.com/browser-windows");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,300)");
driver.findElement(By.xpath("//button[@id='tabButton']")).click();

Set<String> windowids=driver.getWindowHandles();
Iterator<String> it=windowids.iterator();

String parentwindow=it.next();
String child1=it.next();

//	driver.switchTo().window(childwindow);
//	System.out.println(driver.findElement(By.id("sampleHeading")).getText());
//	driver.switchTo().window(parentwindow);
	
	}

}
