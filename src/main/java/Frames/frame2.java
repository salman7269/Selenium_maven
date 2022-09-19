package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
     System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        
	}

}
