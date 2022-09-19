package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX1 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeOptions opt = new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new ChromeDriver(opt);
	driver.get("https://www.vskills.in/certification/tutorial/nesting-framesets-and-inline-frames/");
	Actions act= new Actions(driver);
	WebElement target=driver.findElement(By.linkText("Popular Links"));
	act.moveToElement(target).build().perform();
	Thread.sleep(3000);
	act.moveToElement(driver.findElement(By.linkText("Register Now"))).click().build().perform();
	
	}

}
