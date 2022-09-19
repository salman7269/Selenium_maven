package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
////input[@type='password']
import io.github.bonigarcia.wdm.WebDriverManager;

public class action1 {
/*
 * Scenario Steps :
1. Login in to gmail
2. Based on the subject of a mail, Right click on the mail
3. Select Archive option
 */
	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://mail.google.com/mail");
driver.findElement(By.xpath("//*[text()='Sign in']")).click();
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sallu5269@gmail.com");
driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8435393570", Keys.ENTER);
Thread.sleep(2000);
WebElement ele=driver.findElement(By.xpath("(//span[contains(text(),'The Humiliating History of the TSA')])[2]"));
Actions act= new Actions(driver);
act.contextClick(ele).perform();

Thread.sleep(4000);
driver.quit();
	}

}
