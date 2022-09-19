package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert5 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeOptions opt = new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new ChromeDriver(opt);
driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
driver.findElement(By.xpath("(//*[text()='Click me'])[1]")).click();	
Thread.sleep(2000);
driver.switchTo().alert().accept();
	}

}
