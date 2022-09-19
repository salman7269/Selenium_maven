import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
// we cannot automate racptacha
public class recaptcha {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://phptravels.com/demo/");
driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Shaikh");
driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Salman");
driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("Aalishan Dryfruits");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sallu4565@gmail.com");
Thread.sleep(10000);
driver.findElement(By.xpath("//button[text()='Submit']")).click();

		
		
		
	}

}
