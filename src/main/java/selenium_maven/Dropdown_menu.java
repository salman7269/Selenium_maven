package selenium_maven;
/*
 For dropdown there are three methods to select dropdown menu
 1)SelectByVisibleText();
 2)SelectByValue();
 3)SelectByIndex();
 
  */
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_menu {

public static void main(String[] args) throws AWTException, InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
 
WebElement ele=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
Select cntry= new Select(ele);
cntry.selectByVisibleText("India");

	
	
	}

}
