package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drop_down2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.yatra.com/");
		WebElement ele=driver.findElement(By.linkText("\r\n"
				+ "            Yatra for Travel Agents\r\n"
				+ "          "));
		ele.click();
		
		
	}

}
