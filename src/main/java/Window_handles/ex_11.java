package Window_handles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_11 {

	public static void main(String[] args) {
//https://www.rahulshettyacademy.com/AutomationPractice/

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
	Set<String> windowids=driver.getWindowHandles();
	Iterator<String> it=windowids.iterator();
	String parentwindow=it.next();
	String childwindow=it.next();
	driver.switchTo().window(childwindow);
	
	driver.findElement(By.xpath("//a[text()='Courses']")).click();
	driver.switchTo().window(parentwindow);
	System.out.println(driver.getTitle());
	
	
	}

}
