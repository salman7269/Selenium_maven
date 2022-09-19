package selenium_maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swag_labs {

	public static void main(String[] args) throws InterruptedException, AWTException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
Robot robot =new Robot();
driver.get("https://www.saucedemo.com/");

robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@type=\"text\"])")).sendKeys("performance_glitch_user",Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("(//input [@autocapitalize=\"none\"])[2]")).sendKeys("secret_sauce",Keys.ENTER);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@type=\"submit\"])")).click();
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);

driver.findElement(By.xpath("(//button[@data-test=\"add-to-cart-sauce-labs-backpack\"])")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("(//a[@class=\"shopping_cart_link\"])")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("(//button[@data-test=\"checkout\"])")).click();
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Shaikh");
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Salman");
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("450331");
Thread.sleep(1000);

robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_PAGE_UP);	
	}

}
