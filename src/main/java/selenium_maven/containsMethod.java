package selenium_maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class containsMethod {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Robot robot = new Robot();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@data-test,\"username\")]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[contains(@data-test,\"password\")]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[contains(@data-test,\"login-button\")]")).click();
		Thread.sleep(1000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,\"btn btn_primary btn_small btn_inventory\")]")).click();
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		Thread.sleep(1000);
		//js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//button[contains(@id,\"checkout\")]")).click();
	driver.findElement(By.xpath("//input[contains(@data-test,\"firstName\")]")).sendKeys("Shaikh");
	driver.findElement(By.xpath("//input[contains(@data-test,\"lastName\")]")).sendKeys("Salman");
	driver.findElement(By.xpath("//input[contains(@data-test,\"postalCode\")]")).sendKeys("450331");
	js.executeScript("window.scrollBy(0,500)");
	driver.findElement(By.xpath("//input[contains(@data-test,\"continue\")]")).click();
	driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
	}

}
