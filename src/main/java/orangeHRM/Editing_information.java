package orangeHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editing_information {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin", Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[normalize-space()='My Info']")).click();
		Thread.sleep(3000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
	
WebElement ele =driver.findElement(By.xpath("//input[@name=\"personal[txtEmpFirstName]\"]"));
		System.out.println(ele.getAttribute("id"));
		System.out.println(ele.getText());
		
		
	}

}
