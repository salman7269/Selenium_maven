package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice_page {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"radio3\"]")).click();
		Thread.sleep(2000);
		Select se = new Select(driver.findElement(By.id("dropdown-class-example")));
		System.out.println("Is dropdown is multiple "+se.isMultiple());
se.selectByValue("option2")		;
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id=\"checkBoxOption3\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id=\"checkBoxOption2\"]")).click();
		
		
		
	}

}
