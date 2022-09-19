package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dyanamic_dropdown_5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ixigo.com/trains");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Leaving from']")).sendKeys("Indore");
	Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Indore Jn Bg (INDB)']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Going to']")).sendKeys("Ajmer");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='Ajmer Jn (AII)']")).click();
	
	}

}
