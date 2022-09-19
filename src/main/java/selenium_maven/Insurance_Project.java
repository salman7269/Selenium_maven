package selenium_maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Insurance_Project {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
Robot robot = new Robot();

	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("sallu5269@gmail.com");
	driver.findElement(By.xpath("//input[contains(@name,\"password\")]")).sendKeys("8435393570");
	driver.findElement(By.xpath("//input[contains(@name,\"submit\")]")).click();
	
	Thread.sleep(1000);
	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(1000);
	
	//driver.findElement(By.xpath("//li[@id=\"editprofile\"]")).click();
	//Thread.sleep(1000);
	
	}

}
