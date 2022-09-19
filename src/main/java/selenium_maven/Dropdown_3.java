package selenium_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_3 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		
Select s= new Select(driver.findElement(By.xpath("//select[@id=\"ide\"]")));
System.out.println(s.isMultiple());	
s.selectByIndex(0);
s.selectByValue("nb");
s.selectByVisibleText("Visual Studio");
s.deselectAll();

List <WebElement> li= s.getOptions();
for(int i=0; i<li.size(); i++)
{
	System.out.println(li.get(i).getText());
}
		
		
		
	}

}
