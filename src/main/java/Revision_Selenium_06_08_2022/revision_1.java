package Revision_Selenium_06_08_2022;

import java.awt.AWTException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class revision_1 {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		Actions act = new Actions(driver);
		WebElement src=driver.findElement(By.id("sub-menu"));
		WebElement trg= driver.findElement(By.xpath("//a[@id='link2']"));
		
		act.moveToElement(src).click(trg).build().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
	}

}
