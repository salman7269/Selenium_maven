package Revision_Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getoptions_dropdown {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.firefoxdriver().setup();
FirefoxOptions opt= new FirefoxOptions();
opt.addArguments("--disable-notifications");
FirefoxDriver driver= new FirefoxDriver(opt);
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

driver.switchTo().frame("frame-one1434677811");
driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Shaikh");
driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("Salman");

driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("8975664569");
driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("INDIA");
driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']")).sendKeys("Burhanpur");
driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("slajb@gmail.com");
Thread.sleep(2000);
driver.switchTo().defaultContent();
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("window.scrollTo(0,100)");
WebElement trg1=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
Actions act= new Actions(driver);
act.sendKeys(trg1, "salman khan", Keys.ENTER).build().perform();

driver.findElement(By.xpath("//*[text()='Salman Khan']")).click();

Set<String> windowids=driver.getWindowHandles();
Iterator<String> it=windowids.iterator();
String parentwindow=it.next();
String childwindow=it.next();

driver.switchTo().window(childwindow);
String title=driver.getTitle();
System.out.println(title);
Thread.sleep(3000);
driver.switchTo().window(parentwindow);
WebElement ele1=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
act.moveToElement(ele1).doubleClick().build().perform();

driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
driver.switchTo().alert().accept();

WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
WebElement trg=driver.findElement(By.xpath("//div[@id='droppable']"));
act.dragAndDrop(src, trg).build().perform();
	}

}
