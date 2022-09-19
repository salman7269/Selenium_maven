package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isDisplayed_isEnabled_isSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
				
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
	WebElement	ele=driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]"));
System.out.println("Display status:- "+ele.isDisplayed());
Thread.sleep(1000);
ele.click();
System.out.println("Select status:- "+ele.isSelected());
Thread.sleep(1000);

System.out.println("Enable status:- "+ele.isEnabled());
Thread.sleep(1000);

	
	}

}
