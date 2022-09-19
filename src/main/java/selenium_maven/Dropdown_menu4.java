package selenium_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_menu4 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.firefoxdriver().setup();
WebDriver driver= new FirefoxDriver();
driver.get("https://output.jsbin.com/osebed/2");
Select fr= new Select(driver.findElement(By.id("fruits")));
List <WebElement> li=fr.getOptions();
for(int i=0; i<li.size();i++)
{
	System.out.println(li.get(i).getText());
}
fr.selectByIndex(2);
Thread.sleep(1000);
fr.selectByValue("apple");
Thread.sleep(1000);
fr.selectByVisibleText("Grape");
Thread.sleep(5000);
fr.deselectAll();
Thread.sleep(2000);
driver.quit();



	}

}
