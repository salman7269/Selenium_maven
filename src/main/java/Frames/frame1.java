package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame1 {

	public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();

ChromeOptions opt= new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new ChromeDriver(opt);
driver.manage().window().maximize();

driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
Thread.sleep(2000);
driver.switchTo().frame("packageListFrame");
Thread.sleep(2000);
driver.findElement(By.linkText("org.openqa.selenium.bidi")).click();
Thread.sleep(2000);
driver.switchTo().defaultContent();

driver.switchTo().frame("packageFrame");
Thread.sleep(2000);
driver.findElement(By.linkText("BiDi")).click();
Thread.sleep(2000);
driver.switchTo().defaultContent();
	
driver.switchTo().frame("classFrame");
Thread.sleep(2000);
driver.findElement(By.linkText("TREE")).click();
Thread.sleep(2000);
driver.switchTo().defaultContent();
	
	
	
	}

}
