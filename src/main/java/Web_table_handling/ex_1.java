package Web_table_handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_1 {
//to find the number of rows and columns present in web table
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin", Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		int row=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr")).size();
		System.out.println("Number of rows are:- "+row);
		int column=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead/tr/th")).size();
		System.out.println("Number of columns are:- "+column);
		
		
		
	}

}
