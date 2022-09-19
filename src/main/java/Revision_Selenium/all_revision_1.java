package Revision_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import screenshots.section_screenshot_2;

public class all_revision_1 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt= new FirefoxOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new FirefoxDriver(opt);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
driver.findElement(By.xpath("//button[text()='Click Me']")).click();
driver.switchTo().alert().accept();
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,400)");

Select se= new Select(driver.findElement(By.xpath("//select[@id='speed']")));
se.selectByIndex(3);

Select se1= new Select(driver.findElement(By.xpath("//select[@id='files']")));
se1.selectByIndex(3);

Select se2= new Select(driver.findElement(By.xpath("//select[@id='number']")));
se2.selectByIndex(3);
		
Select se3= new Select(driver.findElement(By.xpath("//select[@id='products']")));
se3.selectByIndex(3);

Select se4= new Select(driver.findElement(By.xpath("//select[@id='animals']")));
se4.selectByIndex(3);

WebElement text=driver.findElement(By.xpath("(//div[@class='widget-content'])[4]"));
		
System.out.println("Text:- "+text.getText());
		
		
		
		
		
	}

}
