package selenium_maven;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class set_position_setDimension {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Dimension d= driver.manage().window().getSize();
	System.out.println(d.getHeight());
	System.out.println(d.getWidth());
	
	Dimension d1= new Dimension(250,500);
	driver.manage().window().setSize(d1);
	Thread.sleep(5000);
	
	Point p =driver.manage().window().getPosition();
	System.out.println(p.getX());
	System.out.println(p.getY());
	
	Point p1= new Point (50,30);
	driver.manage().window().setPosition(p1);
	Thread.sleep(5000);
	driver.close();
		
		
		
		
		
	}

}
