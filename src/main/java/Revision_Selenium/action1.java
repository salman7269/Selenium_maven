package Revision_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	WebElement src=	driver.findElement(By.xpath("(//*[@class='button button-orange'])[2]"));
   WebElement trg= driver.findElement(By.xpath("(//*[@class='ui-widget-content'])[3]"));	
		
   Actions act= new Actions(driver);
   act.dragAndDrop(src, trg).perform();
   
	}

}
