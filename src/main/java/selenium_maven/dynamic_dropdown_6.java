package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamic_dropdown_6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=' c-pointer c-neutral-900']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@class='mt-3 mr-3 r-0 p-absolute c-pointer']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@placeholder='Any worldwide city or airport']"))
	.sendKeys("Bhopal");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[text()='Bhopal, IN - Raja Bhoj (BHO)']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[@placeholder='Any worldwide city or airport'])[2]")).sendKeys("Beng");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[text()='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
	
	
	}

}
