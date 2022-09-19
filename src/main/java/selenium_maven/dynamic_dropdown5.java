package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamic_dropdown5 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
driver.get("https://www.railyatri.in/train-ticket");
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@id='boarding_from']")).sendKeys("bhopal");
Thread.sleep(2000);
driver.findElement(By.xpath("//li[@data-value=\"BHOPAL JN | BPL\"]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='boarding_to']")).sendKeys("lucknow");
Thread.sleep(1000);
driver.findElement(By.xpath("//li[@data-value=\"LUCKNOW | LKO\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
