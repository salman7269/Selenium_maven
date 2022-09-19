package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dyanamic_dropdown_3 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.irctc.co.in/nget/train-search");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//span[text()='INDORE JN BG - INDB']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//span[text()='AJMER JN - AII']")).click();

	}

	
}
