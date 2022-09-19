package Revision_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class set_size_and_position {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeOptions opt = new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver = new ChromeDriver(opt);

driver.get("https://www.google.com/");
driver.manage().window().maximize();
Dimension size= driver.manage().window().getSize();
System.out.println(size.height);
System.out.println(size.width);

Dimension d= new Dimension(500,400);
driver.manage().window().setSize(d);

Point p= driver.manage().window().getPosition();
System.out.println(p.x);
System.out.println(p.y);

Point p1= new Point (40,100);
driver.manage().window().setPosition(p1);

	}

}
