package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class check_uncheck {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.get("https://demo.guru99.com/test/radio.html");
		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"checkbox2\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"checkbox3\"]")).click();

	
	}

}
