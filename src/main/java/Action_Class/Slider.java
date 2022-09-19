package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
JavascriptExecutor js =(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,600)");
WebElement ele= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

	Actions act= new Actions(driver);
	act.dragAndDropBy(ele, 100, 0).build().perform();

	}

}
