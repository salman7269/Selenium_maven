package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NitaMAM {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("sanity" , Keys.ENTER);
		
		
	}

}
