package Revision_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelement_method {
//WeBelement
	//sendkeys method
	//click();
	//isSelected
	//isDisplayed
	//isEnables
	//getText method
	//clear
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin"); //sendkeys method
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123"); //sendkeys method
		
		driver.findElement(By.xpath("//button[@type='submit']")).click(); //click() method
		driver.findElement(By.xpath("//*[text()='My Info']")).click();
		String ele=driver.findElement(By.xpath("//input[@name='firstName']")).getText(); //get text method
	System.out.println(ele);
	driver.findElement(By.xpath("//input[@name='firstName']")).clear(); //clear method
	WebElement element=driver.findElement(By.xpath("//input[@name='lastName']"));
System.out.println("Is Displayed:- "+element.isDisplayed()); //isDisplayed
System.out.println("Is Selected:- "+element.isSelected());  //isSelected
System.out.println("Is Enabled:- "+element.isEnabled());   //isEnabled
	}

}
