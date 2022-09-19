package HeadLess_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_5 {

	public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
FirefoxOptions opt= new FirefoxOptions();
opt.setHeadless(true);
WebDriver driver = new FirefoxDriver(opt);

driver.get("https://opensource-demo.orangehrmlive.com/");
System.out.println("Before Login Title:- "+driver.getTitle());
driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
System.out.println("After Login title:- "+driver.getTitle());


	}

}
