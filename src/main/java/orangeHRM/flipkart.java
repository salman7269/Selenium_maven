package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeOptions opt = new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver = new ChromeDriver(opt);
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("mobile", Keys.ENTER);
driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
Actions act = new Actions(driver);
act.sendKeys(Keys.CONTROL+"TAB");
//act.moveToElement(driver.findElement(By.xpath("//span[text()='View Details']"))).click().build().perform();

	}

}
