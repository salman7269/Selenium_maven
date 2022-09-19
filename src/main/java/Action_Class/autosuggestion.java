package Action_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestion {

	public static void main(String[] args) throws InterruptedException {
/*
 * Automate the following scenario :
● Navigate to google page
● Enter Selenium in google search text box
● Print the list of auto suggestion values
● Click on a specified link ( Selenium Interview Questions) displayed in the dropdown
 */
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
	List<WebElement> ele=driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));	
		
		System.out.println("The the number of options:- "+ele.size());
		for(int i=0; i<ele.size(); i++)
		{
		System.out.println(ele.get(i).getText());
		
		}
		ele.get(1).click();
		
	 
		
		
		
		
		
		
		
		
		
	}

}
