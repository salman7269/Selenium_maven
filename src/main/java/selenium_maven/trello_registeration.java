package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trello_registeration {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.findElement(By.xpath("//input[@name=\"field-keywords\"]")).sendKeys("selenium book", Keys.ENTER);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,400)");
Thread.sleep(1000);
WebElement ele =driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]"));
System.out.println("Price of book :- "+ele.getText());		
		
	}

}
