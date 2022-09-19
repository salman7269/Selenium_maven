package Scrolling_WebPAge;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_JavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
//We are scrolling using pixel of webpage
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)");
	
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
		
	}

}
