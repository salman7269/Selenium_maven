package selenium_maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class payment_gateway_project {

	public static void main(String[] args) throws AWTException, InterruptedException {
WebDriverManager.edgedriver().setup();
WebDriver driver= new EdgeDriver();
driver.get("https://demo.guru99.com/payment-gateway/index.php");
		Robot robot= new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@type,\"submit\")]")).click();
		
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@name,\"card_nmuber\")]")).sendKeys("6547123658912256");
		driver.findElement(By.xpath("//select[contains(@name,\"month\")]")).click();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[contains(@name,\"year\")]")).click();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@name,\"cvv_code\")]")).sendKeys("256");
		driver.findElement(By.xpath("//input[contains(@value,\"Pay $20.00\")]")).click();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		
	}

}
