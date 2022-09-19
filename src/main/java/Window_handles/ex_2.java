package Window_handles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_2 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt= new FirefoxOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@id='getwebsitebtn']")).click();
	Set<String>windowids=driver.getWindowHandles();
		System.out.println(windowids);;
java.util.Iterator<String> it=windowids.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		
		
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='modalusername']")).sendKeys("salman5269@gmail.com");
		driver.findElement(By.xpath("//input[@id='current-password']")).sendKeys("1235464");
		
		driver.switchTo().window(parentwindow);
		System.out.println(driver.findElement(By.xpath("//div[@id='textarea']")).getText());
		
		
	}

}
