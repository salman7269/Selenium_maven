package Action_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
List<WebElement> allLinks=	driver.findElements(By.tagName("a"));
System.out.println("The number of links are:- "+allLinks.size());

int visibleLinks=0;
int hiddenLinks=0;
for(WebElement links:allLinks)
{
	if(links.isDisplayed())
	{
		visibleLinks++;
		
	}
	else
	{
		hiddenLinks++;
	}
}
System.out.println("The Number of Visible Links are:- "+visibleLinks);
System.out.println("The Number of hidden Links are:- "+hiddenLinks);
	
	
	
	
	
	
	
	}
	
	

}
