package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class right_click {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act= new Actions(driver);
		WebElement source= driver.findElement(By.xpath("//*[text()='right click me']"));
		act.contextClick(source).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Paste']")).click();
	
	
	}

}
