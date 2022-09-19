package Revision_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class all_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt= new FirefoxOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new FirefoxDriver(opt);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

WebElement src1=driver.findElement(By.xpath("//button[text()='Copy Text']"));
Actions act= new Actions(driver);
act.doubleClick(src1).build().perform();

WebElement src2=driver.findElement(By.xpath("//div[@id='draggable']"));
WebElement trg1=driver.findElement(By.xpath("//div[@id='droppable']"));		
act.dragAndDrop(src2, trg1).build().perform();
Thread.sleep(3000);
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,700)");
WebElement src3=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
WebElement src4=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[2]"));
WebElement trg2=driver.findElement(By.xpath("//div[@id='trash']"));
act.dragAndDrop(src3, trg2).build().perform();
act.dragAndDrop(src4, trg2).build().perform();

WebElement trg3=driver.findElement(By.xpath("//div[@id='slider']"));
js.executeScript("window.scrollTo()",trg3);
act.dragAndDropBy(trg3, 200, 0).build().perform();
		
	}

}
