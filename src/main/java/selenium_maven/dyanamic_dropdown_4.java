package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dyanamic_dropdown_4 {

public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.ixigo.com/trains");
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@id='anguScroll_value'])[1]")).sendKeys("indo");
Thread.sleep(1000);
driver.findElement(By.xpath("(//div[@title='INDORE (IDR)'])[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@id='anguScroll_value'])[2]")).sendKeys("mum");
Thread.sleep(1000);
driver.findElement(By.xpath("(//div[@title='MUMBAI (BOM)'])[2]")).click();
		
	}

}
