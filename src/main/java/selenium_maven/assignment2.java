package selenium_maven;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class assignment2 {

public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.co.in");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

driver.navigate().to("https://www.facebook.com/");
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
Dimension D = new Dimension(200,400);
driver.manage().window().setSize(D);
Thread.sleep(2000);

Point P = new Point(100,100);
driver.manage().window().setPosition(P);
Thread.sleep(2000);

driver.navigate().to("https://www.facebook.com/");
Thread.sleep(3000);
driver.navigate().refresh();
Thread.sleep(3000);
driver.close();


	}

}
