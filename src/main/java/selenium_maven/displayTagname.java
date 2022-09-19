package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class displayTagname {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
				
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
WebElement ele=driver.findElement(By.xpath("//input[@name=\"pass\"]"));
System.out.println(ele.getAttribute("data-testid"));		
System.out.println(ele.getTagName());
		
		
	}

}
