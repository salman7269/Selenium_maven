package Revision_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://demoqa.com/select-menu");
JavascriptExecutor js= (JavascriptExecutor)driver;	
js.executeScript("window.scrollBy(0,500)");
Thread.sleep(2000);
WebElement ele=driver.findElement(By.xpath("( //div[@class=' css-1hwfws3'])[3]"));
ele.click();
Thread.sleep(2000);
ele.sendKeys("G", Keys.ENTER);
Thread.sleep(2000);
ele.sendKeys("r",Keys.ENTER);
Thread.sleep(2000);
ele.sendKeys("blu",Keys.ENTER);
	
	
	}

}
