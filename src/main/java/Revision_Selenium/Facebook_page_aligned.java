package Revision_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_page_aligned {
//write a program to verify whether the fb page's user/pass is aligned or not.

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ustab=driver.findElement(By.id("email"));
		WebElement passtab=driver.findElement(By.id("pass"));
		
		//getting the y-coordinate of username
		int YTustab=ustab.getLocation().getY();
		System.out.println("The Y coordinate of username:- "+YTustab);
		
		// 
	}

}
