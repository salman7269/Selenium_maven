package selenium_maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitwait {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
ChromeOptions opt= new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new ChromeDriver(opt);

driver.get("https://demoqa.com/alerts");
driver.manage().window().maximize();
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,500)");

driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.id("timerAlertButton")).click();
driver.switchTo().alert().accept();

	}

}
