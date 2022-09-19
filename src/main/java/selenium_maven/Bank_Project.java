package selenium_maven;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//UserID="mngr422573"
//PASS="nutUmYz"
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 *Launch new browser
  Open URL https://itera-qa.azurewebsites.net/home/automation
  Select the Radio button (2 years) for category Years of experience in test automation (Find elements by using Xpath method.)
  Check the Check Box ‘Selenium Webdriver’ and TestNG for category ‘Which automation tools/frameworks do you use?'(Find elements by using Xpath method)
  Close browser
 */
public class Bank_Project {

	public static void main(String[] args) throws InterruptedException, AWTException {
WebDriverManager.edgedriver().setup();
WebDriver driver= new EdgeDriver();
driver.get("https://itera-qa.azurewebsites.net/home/automation");
Thread.sleep(4000);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,2500)");
Thread.sleep(4000);
driver.findElement(By.xpath("//label[contains(@for,\"2years\")]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//label[contains(@for,\"selenium\")]")).click();
Thread.sleep(5000);
driver.close();
	}

}
