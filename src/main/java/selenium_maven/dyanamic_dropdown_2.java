package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dyanamic_dropdown_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@placeholder=\"Type to Select Countries\"]")).sendKeys("Bah");
        Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()=\"Bahrain\"]")).click();

		
		
	}

}
