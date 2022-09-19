package Revision_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action2 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt = new FirefoxOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebElement doubclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
	WebElement src=driver.findElement(By.xpath("//*[@id='draggable']"));
WebElement trg=driver.findElement(By.xpath("//*[@id='droppable']"));


Actions act= new Actions(driver);
act.moveToElement(doubclick).doubleClick().perform();
//act.dragAndDrop(src, trg).perform();
act.dragAndDropBy(src, 170, 35).perform();
	}

}
