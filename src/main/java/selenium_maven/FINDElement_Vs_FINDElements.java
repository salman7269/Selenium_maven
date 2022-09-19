package selenium_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FINDElement_Vs_FINDElements {

	public static void main(String[] args) {

//findElement---> returns the single web element
//findElements---> returns the multiple web elements
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in");
driver.findElement(By.name("q")).sendKeys("Flipkart", Keys.ENTER);
driver.findElement(By.xpath("//h3[normalize-space()='Flipkart']")).click();		
WebElement ele= driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));		
System.out.println("Element is :- "+ ele.getText());

//List<WebElement> links = driver.findElements(By.xpath("/html/body/div[1]/div/footer/div/div[3]/div[1]//a"));
	//	System.out.println("Number of elements captured:- "+ links.size());
	}

}
