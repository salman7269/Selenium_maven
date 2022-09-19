package Revision_Selenium_06_08_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for=\"yesRadio\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for=\"impressiveRadio\"]")).click();
		Thread.sleep(3000);

		WebElement ele=driver.findElement(By.xpath("//label[@for=\"noRadio\"]"));
		System.out.println("Is displayed:- "+ele.isDisplayed());
		System.out.println("Is Enabled:- "+ele.isEnabled());
		System.out.println("Is selected:- "+ele.isSelected());
		
		
		
	}

}
