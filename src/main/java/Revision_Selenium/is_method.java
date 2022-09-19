package Revision_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class is_method {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeOptions opt = new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new ChromeDriver(opt);

driver.get("https://www.facebook.com");
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.findElement(By.linkText("Create New Account")).click();
WebElement ele= driver.findElement(By.xpath("//label[@class='_58mt']"));
System.out.println("IS DISPLAYED "+ele.isDisplayed());
System.out.println("Is ENABLED "+ele.isEnabled());
System.out.println("Is SELECTED "+ ele.isSelected());
ele.click();
WebElement ele2= driver.findElement(By.xpath("//label[@class='_58mt']"));
	System.out.println(ele2.isSelected());

	
	}

}
