package Revision_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class set_size_set_position {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
Thread.sleep(2000);
Dimension size =driver.manage().window().getSize();
	System.out.println(size.height);	
	System.out.println(size.width);	
	Dimension d= new Dimension(500,300);
	Thread.sleep(3000);
	driver.manage().window().setSize(d);
	
	Point p= driver.manage().window().getPosition();
	System.out.println(p.x);
	System.out.println(p.y);
	Thread.sleep(3000);
	Point p1= new Point(40,60);
	Thread.sleep(2000);
	driver.manage().window().setPosition(p1);
	
	
		
	}

}
