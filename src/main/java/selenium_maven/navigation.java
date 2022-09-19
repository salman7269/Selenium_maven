package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.firefoxdriver().setup();
WebDriver driver= new FirefoxDriver();
		
driver.get("https://www.google.co.in");
Thread.sleep(2000);
System.out.println("Google page's TITLE:- "+ driver.getTitle());
driver.findElement(By.name("q")).sendKeys("facebook", Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("(//h3[@class=\"LC20lb MBeuO DKV0Md\"])[1]")).click();
System.out.println("facebook url:- "+ driver.getCurrentUrl());
Thread.sleep(2000);
driver.get("https://www.yatra.com/");
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
String exptitle="Facebook – log in or sign up";
String acttitle=driver.getTitle();
if(exptitle.equals(acttitle))
{
	System.out.println("Page is Displayed");
}
else
{
	System.out.println("page not found");
}
Thread.sleep(3000);
Dimension ele= driver.manage().window().getSize();
System.out.println(ele.height);
System.out.println(ele.width);
	
Dimension d= new Dimension(300,300);
driver.manage().window().setSize(d);
Thread.sleep(3000);
Point ele1= driver.manage().window().getPosition();
System.out.println(ele1.x);
System.out.println(ele1.y);

Point p= new Point(400,300);
driver.manage().window().setPosition(p);
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(2000);
driver.navigate().to("https://www.yatra.com/");

String expectTitle="Flight, Cheap Air Tickets , Hotels, Holiday, Trains Package Booking - Yatra.com";
String acttualTitle=driver.getTitle();
if(expectTitle.equals(acttualTitle))
{
	System.out.println("WebPage is Displayed");
}
else
{
	System.out.println("Webpage is not displayed");
}
Thread.sleep(2000);

driver.navigate().refresh();
Thread.sleep(2000);
driver.quit();

	}

}
