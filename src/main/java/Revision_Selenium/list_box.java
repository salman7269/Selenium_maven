package Revision_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class list_box {
// we can handle the list box using the select class
	
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("http://www.qavalidation.com/demo");
JavascriptExecutor js=(JavascriptExecutor)driver;
WebElement ele =driver.findElement(By.xpath("//select[@name='sgender']"));
		js.executeScript("arguments[0].scrollIntoView();",ele);
		Select se= new Select(ele);
		System.out.println("Is Multiple:- "+se.isMultiple());
		se.selectByVisibleText("Female");
		
		List<WebElement> li= se.getOptions();
		for(int i=0; i<li.size(); i++)
		{
		System.out.println(li.get(i).getText());
		}
		
	}

}
