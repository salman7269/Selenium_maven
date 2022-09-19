package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.yatra.com/");
WebElement ele=driver.findElement(By.xpath("//input[@name=\"flight_origin\"]"));
Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		ele.sendKeys("chennai");
		Thread.sleep(2000);
		ele.sendKeys(Keys.ENTER);

		//ele.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
WebElement ele1=driver.findElement(By.xpath("//input[@name=\"flight_destination\"]"));
	Thread.sleep(2000);
	ele1.click();
	Thread.sleep(2000);
	ele1.sendKeys("bhopal");
	Thread.sleep(3000);
	ele1.sendKeys(Keys.ENTER);
		

		
	}

}
