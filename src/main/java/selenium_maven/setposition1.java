package selenium_maven;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setposition1 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		Point p=driver.manage().window().getPosition();
		System.out.println("position x:- "+p.x);
		System.out.println("position y:- "+p.y);
		Point p1=  new Point(50,100); 
	driver.manage().window().setPosition(p1);
	
	Dimension d=driver.manage().window().getSize();
	System.out.println("Height:- "+d.height);
	System.out.println("Width:- "+d.width);
	
	Dimension size= new Dimension(400,300);
	driver.manage().window().setSize(size);
	
	
	
	}

}
