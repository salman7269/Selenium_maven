package Frames;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt = new  FirefoxOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new FirefoxDriver(opt);
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.switchTo().frame("marketing");
	Thread.sleep(2000);
	
WebElement ele1=driver.findElement(By.xpath("(//div[@class='btn-container  '])[3]"));
ele1.click();
	
	}

}
