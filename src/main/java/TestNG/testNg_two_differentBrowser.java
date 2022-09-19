package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNg_two_differentBrowser {

	public void googleTEST() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("aamir khan", Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}
	
	public void FaceBookTEST() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("sallu6253@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("98765431");
		driver.findElement(By.name("login_source")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	

}
