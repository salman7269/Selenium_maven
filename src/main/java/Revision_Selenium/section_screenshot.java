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
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class section_screenshot {

	public static void main(String[] args) throws IOException {
		// (//*[@jsname='haAclf'])[2]
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("flowers", Keys.ENTER);
		driver.findElement(By.xpath("//*[text()='Images']")).click();
	WebElement section=	driver.findElement(By.xpath("(//*[@jsname='haAclf'])[2]"));
	File Src=section.getScreenshotAs(OutputType.FILE);
	File trg = new File("D:/screenshot/revision2.jpg");
	
	FileUtils.copyFile(Src, trg);
	}

}
