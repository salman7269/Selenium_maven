package Revision_Selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class size_and_position {

public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
FirefoxOptions opt= new FirefoxOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new FirefoxDriver(opt);

driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
String title=driver.getTitle();
System.out.println("The title of the page is:- "+title);
//getting size
Dimension size= driver.manage().window().getSize();
System.out.println("The Height of window is:- "+size.height);
System.out.println("The Width of window is:- "+size.width);
//setting size
Dimension size1= new Dimension(500,700);
driver.manage().window().setSize(size1);

Point p=driver.manage().window().getPosition();
System.out.println("The horizontal position:p- "+p.x);
System.out.println("The vertical position:- "+ p.y);

Point p1= new Point(40,80);
driver.manage().window().setPosition(p1);

driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
driver.navigate().back();

System.out.println(driver.getCurrentUrl());

driver.navigate().forward();
System.out.println(driver.getCurrentUrl());



}

}
