package selenium_maven;
////tagname[contains(@attribute,"attribute-value")],

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class finding_element_using_contains {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://demo.guru99.com/test/login.html");
driver.findElement(By.xpath("//input[contains(@class,\"is_required\")]")).sendKeys("salmanxyz@guru99.com");
driver.findElement(By.xpath("//input[contains(@id,\"passwd\")]")).sendKeys("98256******");
driver.findElement(By.xpath("//button[contains(@class,\"button\")]")).click();


	}

}
