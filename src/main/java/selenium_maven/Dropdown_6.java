package selenium_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_6 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://sandbox.mabl.com/dropdowns");
Thread.sleep(1000);
Select se = new Select(driver.findElement(By.xpath("//input[@placeholder=\"Select...\"]")));
System.out.println(se.isMultiple());

driver.close();

//se.selectByIndex(3);
//
//
//List <WebElement> li=se.getOptions();
//for(int i=0; i<li.size(); i++)
//{
//	System.out.println(li.get(i).getText());
//}
//
//

	}

}
