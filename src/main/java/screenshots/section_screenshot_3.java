package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class section_screenshot_3 {
public static void main(String args[]) throws IOException
{
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver= new ChromeDriver(opt);
	
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	 
	WebElement section= driver.findElement(By.xpath("//*[@class='kJjFO0 _3DIhEh']"));
	File src =section.getScreenshotAs(OutputType.FILE);
	File trg= new File("D:\\screenshot\\section4.jpg");
	FileUtils.copyFile(src, trg);
	
}
}
