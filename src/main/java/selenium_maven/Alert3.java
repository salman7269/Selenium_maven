package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert3 {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver= new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
	Thread.sleep(2000);
	
	org.openqa.selenium.Alert alert= driver.switchTo().alert();
	  System.out.println(alert.getText());
	alert.sendKeys("username/password");
    alert.accept();
  
	
	
	
	}

}
