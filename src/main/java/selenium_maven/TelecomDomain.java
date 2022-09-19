package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TelecomDomain {

	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://demo.guru99.com/telecom/index.html");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)");
	driver.findElement(By.linkText("Add Customer")).click();	
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,500)");	
	driver.findElement(By.xpath("//input[@id=\"pending\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("Shaikh");
	driver.findElement(By.xpath("//input[@id=\"lname\"]")).sendKeys("Salman");
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("sallu52669@gmail.com");
	
	
	}

}
