package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamic_dropdown_7 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='close']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys("Bhopal");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Bhopal, India']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@placeholder='To']")).sendKeys("dubai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Dubai, United Arab Emirates'])[2]")).click();
		
	}

}
