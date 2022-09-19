package selenium_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_5 {

	public static void main(String[] args) throws InterruptedException {

		
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Create New Account")).click();
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,300)");
Thread.sleep(1000);
		
Select s1= new Select(driver.findElement(By.xpath("(//select[@name=\"birthday_day\"])")));
System.out.println("IS S1 DROPDOWN is MULTIPLE:- "+s1.isMultiple());
s1.selectByIndex(4);
Thread.sleep(1000);

		
System.out.println("SIZE OF S1 :- "+s1.getOptions().size());
List<WebElement> li= s1.getOptions();
Thread.sleep(1000);

for(int i=0; i<li.size(); i++)
{
	System.out.println("DAY OPTIONS :- "+li.get(i).getText());
}


System.out.println("----------------------------------");

Select s2 = new Select(driver.findElement(By.xpath("(//select[@name=\"birthday_month\"])")));
System.out.println("IS S2 DROPDOWN is MULTIPLE:- "+s2.isMultiple());
Thread.sleep(1000);
s2.selectByIndex(4);
System.out.println("SIZE OF S2 :- "+s2.getOptions().size());
List<WebElement> li1= s2.getOptions();
for(int i=0; i<li1.size(); i++)
{
	System.out.println("MONTH OPTIONS:- "+ li1.get(i).getText());
}

System.out.println("-------------------------------------");


Select s3 = new Select(driver.findElement(By.xpath("(//select[@name=\"birthday_year\"])")));
Thread.sleep(1000);
System.out.println("IS S3 DROPDOWN IS MULTIPLE:- "+ s3.isMultiple());
Thread.sleep(1000);
s3.selectByIndex(4);

System.out.println("SIZE OF S3:- "+ s3.getOptions().size());

List<WebElement> li2= s3.getOptions();
for(int i=0; i<li2.size(); i++)
{
	System.out.println("YEAR Option:- "+ li2.get(i).getText());
}

	}

}
