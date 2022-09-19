package Revision_Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenshot {

	public static void main(String[] args) throws IOException {
WebDriverManager.chromedriver().setup();
ChromeOptions opt = new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.findElement(By.name("q")).sendKeys("flowers", Keys.ENTER);
driver.findElement(By.xpath("//*[text()='Images']")).click();

org.openqa.selenium.TakesScreenshot ts= (org.openqa.selenium.TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File trg = new File("D:/screenshot/revision.jpg");

FileUtils.copyFile(src, trg);
	
	}

}
