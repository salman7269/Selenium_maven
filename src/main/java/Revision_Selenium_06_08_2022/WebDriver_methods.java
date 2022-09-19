package Revision_Selenium_06_08_2022;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_methods {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeOptions opt= new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new ChromeDriver(opt);
//get method
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//is Enableis webelement method;
	System.out.println("CART is ENable/NOt enable:- "+driver.findElement(By.xpath("//a[@class='cart-icon']")).isEnabled());
	driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
	driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[3]")).click();

	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)");
	driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[9]")).click();
	driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[11]")).click();
	driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[16]")).click();
	driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[17]")).click();
	driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	
	System.out.println("The Webtable Structure of Product that i had purchased:- ");
	
	int row=driver.findElements(By.xpath("//*[@id=\"productCartTables\"]/tbody/tr")).size();
	System.out.println("The Number of Rows are:- "+row);
	int column=driver.findElements(By.xpath("//*[@id=\"productCartTables\"]/tbody/tr[1]/td")).size();
	System.out.println("The Number of Columns Are:- "+column);
	System.out.print(driver.findElement(By.xpath("//*[@id=\"productCartTables\"]/thead")).getText()+"     ");
	for(int i=1; i<=row;i++)
	{
		for (int j=1; j<=column; j++)
		{
			System.out.print(driver.findElement(By.xpath("//*[@id=\"productCartTables\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+"     ");
		}
	}
	driver.findElement(By.xpath("//*[text()='Place Order']")).click();
	//handling dropdown
	Select se= new Select(driver.findElement(By.xpath("//select")));
	System.out.println("Is dropdown is multiple:-- "+se.isMultiple());
	se.selectByVisibleText("India");
	List<WebElement> li=se.getOptions();
	//getting all options from the dropdown
	for(int i=0; i<li.size(); i++)
	{
	System.out.println(li.get(i).getText());
	}
	
	driver.findElement(By.className("chkAgree")).click();
	driver.findElement(By.xpath("//*[text()='Proceed']")).click();
	//handling windows
	driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
	Set<String> windowids=driver.getWindowHandles();
	Iterator<String> it=windowids.iterator();
	String parent=it.next();
	String Child=it.next();
	driver.switchTo().window(Child);
	driver.findElement(By.xpath("(//a[@role='button'])[4]")).click();
	
	//handling webtable
	int rows=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/table/tbody/tr")).size();
	int columns=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/table/tbody/tr[1]/td")).size();
	
	for(int i=1; i<=rows; i++)
	{
		for (int j=1; j<=columns; j++)
		{
			System.out.print(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"     ");
		}
	}
	driver.switchTo().window(parent);
	
//*[@id="root"]/div/div/div/div/div/div/table/tbody/tr
	
	}

}
