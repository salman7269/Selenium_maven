package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class list {

	public static void main(String[] args) throws InterruptedException {

		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/select-menu");
Thread.sleep(1000);
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,700)");
		
WebElement ele =driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]"));
Thread.sleep(1000);
Select li= new Select(ele);
Thread.sleep(1000);
li.selectByIndex(2);
Thread.sleep(1000);
WebElement ele1=driver.findElement(By.xpath("(//div[@class=\" css-1hwfws3\"])[2]"));
Thread.sleep(1000);
Select li2= new Select(ele1);
Thread.sleep(1000);
li2.selectByValue("4");
		
		
		
		
	}

}
