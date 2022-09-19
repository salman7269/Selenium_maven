package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class contextclick {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.actimind.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement target= driver.findElement(By.linkText("ABOUT COMPANY"));
		Actions act = new Actions(driver);
		act.moveToElement(target).contextClick().build().perform();
		act.sendKeys(Keys);
		act.sendKeys("i");
		
	}

}
