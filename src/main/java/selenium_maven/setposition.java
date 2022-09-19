package selenium_maven;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setposition {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
driver.get("https://www.google.co.in/");
Dimension size = driver.manage().window().getSize();//get size
System.out.println(size.height);
System.out.println(size.width);

Dimension D= new Dimension(200,500); //set size method
driver.manage().window().setSize(D);

Thread.sleep(5000);

Point p= driver.manage().window().getPosition();
System.out.println(p.getX());
System.out.println(p.getY());

Point p1= new Point(50,60);
driver.manage().window().setPosition(p1);

//driver.close();


	}

}
