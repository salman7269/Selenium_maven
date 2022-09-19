package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		js.executeScript("window.scrollBy(200,0)");
		
		WebElement Source= driver.findElement(By.xpath("//*[text()='Mr John']"));
		WebElement target= driver.findElement(By.xpath("//*[text()='Trash']"));
		Actions act= new Actions(driver);
		act.dragAndDrop(Source, target).build().perform();
		Thread.sleep(3000);
		
	
		WebElement Source1=driver.findElement(By.xpath("//*[text()='Mary']"));
		act.dragAndDrop(Source1, target).build().perform();
	}

}
