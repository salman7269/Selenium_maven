package Scrolling_WebPAge;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_to_Specific_element {

	public static void main(String[] args) {
//scroll the page till we find certain element

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("flowers", Keys.ENTER);
		
		
WebElement ele=driver.findElement(By.partialLinkText("Kraft Seeds Zinnia Dahlia"));
	js.executeScript("arguments[0].scrollIntoView();", ele);

		
		
	}

}
