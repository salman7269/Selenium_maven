package Revision_Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot_section {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("tigers", Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		WebElement section=driver.findElement(By.xpath("(//img[@jsname='Q4LuWd'])[3]"));
		File src=section.getScreenshotAs(OutputType.FILE);
		File trg = new File("D:\\screenshot\\tiger.jpg");
		FileUtils.copyFile(src, trg);
		
		
	}

}
