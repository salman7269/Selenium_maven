package Revision_Selenium;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class visibleLinks {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		List<WebElement> AllLinks=driver.findElements(By.xpath("//a"));
		
		int visibleLinks=0;
		int hiddenLinks=0;
		
		for(WebElement link:AllLinks)
		{
			if(link.isDisplayed())
			{
				visibleLinks++;
				System.out.println(link.getText());
			}
			else
			{
				hiddenLinks++;
			
			}
		}
		System.out.println("The Number of Visible Links are:- "+visibleLinks);
		System.out.println("The Number of hidden Links are:- "+hiddenLinks );
		
		
		
		
		
		
	}

}
