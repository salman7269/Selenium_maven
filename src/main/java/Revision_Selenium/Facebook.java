package Revision_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
/*
 * Write a program to validate the height and width of Username and Password fields on Facebook login page are
same or not ?
 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ustab=driver.findElement(By.id("email"));
		WebElement passtab=driver.findElement(By.id("pass"));
		
	Dimension userSize=	ustab.getSize();
	int userHeight=userSize.getHeight();
	int userWidth=userSize.getWidth();
	System.out.println("Height of Username field:- "+userHeight);
	System.out.println("width of Username field:- "+userWidth);

	Dimension passSize=passtab.getSize();
	int passHeight=passSize.getHeight();
	int passWidth=passSize.getWidth();
	System.out.println("Height of password field:- "+passHeight);
	System.out.println("width of password field:- "+passWidth);
	
	if (userHeight==passHeight && userWidth==passWidth )
	{
		System.out.println("Height and Width of username and password fields are same");
	}
	else
	{
		System.out.println("Height and Width of username and password fields are NOT same");

	}
	}

}
