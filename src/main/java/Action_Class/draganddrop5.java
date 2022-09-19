package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
		
		WebElement s1= driver.findElement(By.xpath("(//div[text()='DOG'])[2]"));
		WebElement s2= driver.findElement(By.xpath("(//div[text()='CAT'])[2]"));
		WebElement s3= driver.findElement(By.xpath("(//div[text()='HORSE'])[2]"));
		WebElement s4= driver.findElement(By.xpath("(//div[text()='TIGER'])[2]"));

		WebElement t=driver.findElement(By.xpath("(//div[@id='dropBox'])"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(s4, t).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(s2, t).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(s3, t).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(s1, t).build().perform();
		
	}

}
