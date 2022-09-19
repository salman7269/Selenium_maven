package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class copy_paste_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//input[@id=\"txtUsername\"]"));
		ele.sendKeys("Admin", Keys.CONTROL+"a");
		Thread.sleep(1000);
		ele.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		ele.sendKeys(Keys.TAB,Keys.CONTROL+"v");
		Thread.sleep(1000);
		//ele.sendKeys(Keys.CONTROL+"v");
		
	}

}
