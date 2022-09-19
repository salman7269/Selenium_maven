package selenium_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findelements1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Create New")).click();

	 Select se= new Select(driver.findElement(By.xpath("//select[@name=\"birthday_month\"]")));
		List<WebElement> li= se.getOptions();
		for(int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i).getText());
		}
	
	
	
	}
	}


