package Revision_Selenium_06_08_2022;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowids=driver.getWindowHandles();
		 Iterator<String> it = windowids.iterator();
		
		String parentwindow=it.next();
		String childwindow=it.next();
		
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();
		
		String childTitle=driver.getTitle();
		driver.switchTo().window(parentwindow);
		String parentTitle=driver.getTitle();
		if(parentTitle.equals(childTitle))
			
		{
			System.out.println("Test is Failed");
		}
		else
		{
			System.out.println("Test is passed");
		}
	}

}
