package Revision_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findelements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ixigo.com/trains");
		driver.manage().window().maximize();
		List<WebElement> li=driver.findElements(By.xpath("//a"));
		System.out.println("Count:- "+li.size());
	}

}
