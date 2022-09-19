package Revision_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_methods {
//get();
	//getTitle ;
	//getCurrentURL;
	//getWindowHandles
	//getsize
	//navigate();
	//getPosition
	//close
	//quit
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com"); //get methods
		driver.manage().window().maximize(); //manage, window, maximize methods
		String title=driver.getTitle(); //getTitle methods
		System.out.println(title);
		
		String URL=driver.getCurrentUrl(); //getCurrentUrl
		System.out.println("URL is:- "+URL);
		
		Dimension D=driver.manage().window().getSize(); //getSize
		System.out.println("Height of page:- "+D.height);
		System.out.println("Width of page:- "+D.width);
		
		Dimension D1= new Dimension(300,400);
		driver.manage().window().setSize(D1); //SetSize
		Thread.sleep(3000);
		
		Point p= driver.manage().window().getPosition(); //getposition
		System.out.println("Horizontal position:- "+p.x);
		System.out.println("Veritcal position:- "+p.y);
		Thread.sleep(3000);

		Point p1= new Point(50,100);
		driver.manage().window().setPosition(p1); // set position
		Thread.sleep(3000);

		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.navigate().to("https://www.facebook.com"); //navigate to
		Thread.sleep(3000);
        driver.navigate().back(); //navigate back
		Thread.sleep(3000);
        driver.navigate().forward();//navigate forward 
        Thread.sleep(3000);
        driver.navigate().refresh(); //navigate refresh
        Thread.sleep(3000);
        
        driver.quit();
        

	}

}
