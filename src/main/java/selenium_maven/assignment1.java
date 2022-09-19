package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.co.in");
Thread.sleep(5000);

driver.manage().window().maximize();
Thread.sleep(2000);
Dimension D =new Dimension(500, 500);
driver.manage().window().setSize(D);

Window ele=driver.manage().window();
System.out.println(ele.getPosition());

Point P = new Point(200,300);
driver.manage().window().setPosition(P);
Thread.sleep(3000);
driver.close();





	}

}
