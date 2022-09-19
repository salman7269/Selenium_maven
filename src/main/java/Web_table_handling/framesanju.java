package Web_table_handling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framesanju {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds=driver.getWindowHandles(); //return ids of multiple tabs of windows
		//System.out.println(windowIds);
		
		Iterator<String> it= windowIds.iterator();
		String parentid=it.next();
		String childid=it.next();
		//System.out.println("ParentIDs:- "+parentid);
		//System.out.println("ChildIDs:- "+childid);
		
		driver.switchTo().window(childid); //switching the child window
		driver.findElement(By.xpath("(//input [@type='submit'])[1]")).click();
		
		driver.switchTo().window(parentid); //sswithing the parent window
		driver.findElement(By.xpath("//span[text()='Username']")).click();
		
		
	}

}
