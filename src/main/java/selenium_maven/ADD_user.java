package selenium_maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ADD_user {

public static void main(String[] args) throws InterruptedException, AWTException {

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.globalsqa.com/demo-site/dialog-boxes/");
Thread.sleep(1000);

driver.findElement(By.xpath("//button[@id=\"create-user\"]")).click();
driver.findElement(By.xpath("//input[contains(@id,\"name\")]")).clear();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[contains(@id,\"name\")]")).sendKeys("Shaikh Salman", Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[contains(@id,\"email\")]")).clear();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[contains(@id,\"email\")]")).sendKeys("sallu5269@gmail.com", Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[contains(@id,\"pass\")]//input[contains(@id,\"pass\")]")).clear();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[contains(@id,\"pass\")]")).sendKeys("84353652145", Keys.ENTER);
Thread.sleep(1000);

//driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]")).click();

		
	}

}
