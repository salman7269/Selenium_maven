package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class add_to_cart {

public static void main(String[] args) throws InterruptedException {
WebDriverManager.firefoxdriver().setup();
WebDriver driver= new FirefoxDriver();
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
Thread.sleep(1000);
driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
Thread.sleep(1000);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,1100)");
Thread.sleep(1000);
driver.findElement(By.xpath("(//button[@type=\"button\"])[27]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//img[@alt=\"Cart\"])")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[text()=\"PROCEED TO CHECKOUT\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[text()=\"Place Order\"]")).click();
	Thread.sleep(2000);
	Select se= new Select(driver.findElement(By.xpath("//select[@style=\"width: 200px;\"]")));
System.out.println(se.isMultiple());
se.selectByValue("India");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[text()=\"Proceed\"]")).click();
}

}
