package Revision_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getText_getAttribute {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/\"");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin", Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("My Info")).click();
		WebElement ele =driver.findElement(By.xpath("//input[@name=\"personal[txtEmpFirstName]\"]"));
	System.out.println("attribute is :- "+ele.getAttribute("name"));
	System.out.println("text:- "+ele.getText());
	
	}

}
