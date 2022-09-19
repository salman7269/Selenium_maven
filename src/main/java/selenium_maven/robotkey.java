package selenium_maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class robotkey {

	public static void main(String[] args) throws InterruptedException, AWTException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.nopcommerce.com/en/login");
Thread.sleep(3000);
Robot robot= new Robot();
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_T);
Thread.sleep(3000);
driver.findElement(By.id("input")).sendKeys("salman", Keys.ENTER);	
driver.close();
	}

}
