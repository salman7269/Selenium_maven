package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement source= driver.findElement(By.xpath("(//*[@class=\"ui-slider-handle ui-corner-all ui-state-default\"])"));
	Actions act = new Actions(driver);
	act.moveToElement(source).doubleClick().dragAndDropBy(source, 400, 0).build().perform();
	
	
	}

}
