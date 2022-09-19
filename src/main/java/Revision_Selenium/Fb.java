package Revision_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");


List<WebElement> links=driver.findElements(By.xpath("//a"));

int visibleLink=0;
int hiddenLink=0;

for( WebElement link : links)
{
	if(link.isDisplayed()) {
		
		visibleLink++;
	}
	else
	{
		hiddenLink++;
	}
}

System.out.println("ToTal Number of Visible Links are :- "+ visibleLink);
System.out.println("ToTal Number of hidden Links are :- "+ hiddenLink);


//driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
//Thread.sleep(3000);
//WebElement ele= driver.findElement(By.id("year"));
//Select se = new Select(ele);
//se.selectByIndex(6);
//Thread.sleep(3000);
//
//WebElement ele1= driver.findElement(By.xpath("//select[@id='day']"));
//Select se1 = new Select(ele1);
//se1.selectByIndex(6);
//Thread.sleep(3000);
//
//WebElement ele2= driver.findElement(By.id("month"));
//Select se2 = new Select(ele2);
//se2.selectByVisibleText("Jul");
//Thread.sleep(3000);
//
//System.out.println("Year drop down is multiple ?:- "+se.isMultiple());
//System.out.println("month drop down is multiple ?:- "+se2.isMultiple());
//System.out.println("day drop down is multiple ?:- "+se1.isMultiple());

	}

}
