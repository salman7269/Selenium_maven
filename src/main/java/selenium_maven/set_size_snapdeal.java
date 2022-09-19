package selenium_maven;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class set_size_snapdeal {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.edgedriver().setup();
WebDriver driver= new EdgeDriver();
driver.get("https://www.snapdeal.com/");
Dimension size=driver.manage().window().getSize();
System.out.println(size.height);
System.out.println(size.width);

Thread.sleep(2000);
Dimension D= new Dimension(250,650);
driver.manage().window().setSize(D);

Thread.sleep(2000);

Point position= driver.manage().window().getPosition();
System.out.println(position.x);
System.out.println(position.y);

Point p= new Point(20,20);
driver.manage().window().setPosition(p);
	}

}
