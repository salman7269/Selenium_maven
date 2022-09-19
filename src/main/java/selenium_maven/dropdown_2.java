package selenium_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		Select se = new Select(driver.findElement(By.xpath("//select[@id=\"speed\"]")));
		Thread.sleep(1000);
		System.out.println("Is speed dropdown is multiple:- "+se.isMultiple());
		System.out.println("---------------------------------------------");

		Thread.sleep(1000);
		se.selectByVisibleText("Faster");
		
		List <WebElement> li = se.getOptions();
		for(int i=0; i<li.size(); i++)
		{
			System.out.println("Speed dropdown Options:- "+li.get(i).getText());
		}
		System.out.println("---------------------------------------------");
		
		Select se1= new Select(driver.findElement(By.xpath("//select[@id=\"files\"]")));
		System.out.println("Is files dropdown is multiple:- "+se1.isMultiple());
		Thread.sleep(1000);
		System.out.println("---------------------------------------------");

		se1.selectByVisibleText("PDF file");
		
		List <WebElement> li1= se1.getOptions();
		for(int i=0; i<li1.size();i++)
		{
			System.out.println("File options:- "+li1.get(i).getText());
		}
		System.out.println("---------------------------------------------");

		Select se2= new Select(driver.findElement(By.xpath("//select[@name='number']")));
		System.out.println("Is number dropdown is multiple:- "+se2.isMultiple());
		System.out.println("---------------------------------------------");

		Thread.sleep(1000);
		se2.selectByVisibleText("2");
		
		List <WebElement> li2= se2.getOptions();
		for(int i=0; i<li2.size(); i++)
		{
			System.out.println("number dropdown Options:- "+li2.get(i).getText());
		}
		System.out.println("---------------------------------------------");
       
        js.executeScript("0,700");
        Thread.sleep(1000);
        
        Select se3= new Select(driver.findElement(By.xpath("//select[@name='products']")));
        System.out.println("Is Product dropdown is multiple:- "+se3.isMultiple());
		System.out.println("---------------------------------------------");

        se3.selectByValue("Apple");
        
        List <WebElement> li3= se3.getOptions();
        for(int i=0; i<li3.size(); i++)
        {
        	System.out.println("Product dropdown Options:- "+li3.get(i).getText());
        }
		System.out.println("---------------------------------------------");

		   Select se4= new Select(driver.findElement(By.xpath("//select[@name='animals']")));
		   System.out.println("Is Animal dropdown is multiple:- "+se4.isMultiple());
			System.out.println("---------------------------------------------");
			se4.selectByValue("big baby cat");
List <WebElement> li4= se4.getOptions();
for (int i=0; i<li4.size();i++)
{
	System.out.println("Animal dropdown Options:- "+li4.get(i).getText());
}
		
		
		
		
	}

}
