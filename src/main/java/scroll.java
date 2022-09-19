import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");	
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Teddy", Keys.ENTER);
Thread.sleep(2000);

	Robot robot = new Robot();
	robot.mouseWheel(10);
	driver.manage().window().maximize();
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg= new File("D:\\screenshot\\flip.png");
	FileUtils.copyFile(src, trg);
	
	}

}
