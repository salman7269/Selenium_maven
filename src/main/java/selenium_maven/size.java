package selenium_maven;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class size {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.co.in");
Dimension size = driver.manage().window().getSize();
System.out.println(size.height);
System.out.println(size.width);

driver.navigate().to("https://www.flipkart.com/");
Dimension size1= new Dimension(400,800);
driver.manage().window().setSize(size1);
Thread.sleep(2000);
driver.navigate().back();
driver.manage().window().maximize();
Thread.sleep(2000);
driver.navigate().refresh();
driver.navigate().forward();



	}

}
