package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement source= driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement target= driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		Actions act= new Actions(driver);
		act.moveToElement(source).dragAndDrop(source, target).build().perform();
		
		
	}

}
