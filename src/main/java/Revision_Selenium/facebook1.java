package Revision_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook1 {
/*
 * Write a script to validate that the username field on Facebook login page is smaller than 
 * the Mobile Number field
?
 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension ustab=driver.findElement(By.id("email")).getSize();
		
		int userWidth=ustab.getWidth();//
		System.out.println("Username field width:- "+userWidth);
		
		Dimension passtab=driver.findElement(By.id("pass")).getSize();
		
		int passWidth=passtab.getWidth();
		System.out.println("Password field width:- "+passWidth);
		
		if(userWidth>passWidth)
		{
			System.out.println("Username field is larger than password field");
		}
		else if (userWidth==passWidth)
		{
			System.out.println("Username field is equal to password field");
        }
		
		else
		{
			System.out.println("Username field is smaller than password field");

		}
	}

}
