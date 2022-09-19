package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamic_dropdown_using_frame {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		
		EdgeOptions opt= new EdgeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new EdgeDriver(opt);
		driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(2000);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='notification-frame-~19713b227']")));
	driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("indore");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[text()='Indore, India']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Ajmer");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//p[text()='Ajmer, India']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	
	
	
	}

}
