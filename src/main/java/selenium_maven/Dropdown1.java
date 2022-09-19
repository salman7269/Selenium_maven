package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
driver.get("https://www.vskills.in/certification/tutorial/nesting-framesets-and-inline-frames/");
	driver.findElement(By.linkText("Popular Links")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Register Now")).click();
	
	
	
	}

}
