package Window_handles;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_1 {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt= new FirefoxOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();

		WebElement button=driver.findElement(By.xpath("//button[@id='tabButton']"));
		button.click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(button));
		Set<String> s=driver.getWindowHandles();
		for(String i:s)
		{
			String t= driver.switchTo().window(i).getTitle();
			System.out.println("Ids of available windows:- "+i);
			System.out.println("Title of windows:- "+t);
			//how to close specific window
			if(t.contains("ToolsQA"))
			{
				driver.close();
			}
		}
		
		
		
		
		
	}

}
