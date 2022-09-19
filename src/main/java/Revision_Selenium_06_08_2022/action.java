package Revision_Selenium_06_08_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/buttons");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


WebElement doubleclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
WebElement RightClick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
WebElement click=driver.findElement(By.xpath("//*[text()='Click Me']"));
	
	Actions act= new Actions(driver);
	act.moveToElement(doubleclick).doubleClick().build().perform();
	Thread.sleep(2000);
	act.moveToElement(RightClick).contextClick().build().perform();
	Thread.sleep(2000);
	act.moveToElement(click).click().build().perform();
	
	}

}
