package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice_page2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement ele= driver.findElement(By.name("q"));
		System.out.println("Size "+ele.getSize());
		Thread.sleep(1000);
		System.out.println("Location "+ele.getLocation());
		Thread.sleep(1000);
		System.out.println(ele.getCssValue("font "+"font-size"));
		
		driver.close();
		
		
		
		
	}

}
