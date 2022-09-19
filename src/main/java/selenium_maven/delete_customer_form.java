package selenium_maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class delete_customer_form 
{
	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		Thread.sleep(2000);

Robot robot = new Robot();
Thread.sleep(2000);

robot.keyPress(KeyEvent.VK_ENTER);

	}

}
