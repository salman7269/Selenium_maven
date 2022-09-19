package selenium_maven;
//there are two types of dropdown :-
//1)static dropdown--->in which select is present as a tagname
//2)dynamic dropdown-->in which selct is not present
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_menu2 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.edgedriver().setup();
WebDriver driver= new EdgeDriver();
		
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.linkText("Create New Account")).click();
Thread.sleep(2000);
WebElement a= driver.findElement(By.xpath("//select[@id=\"day\"]"));
Select b= new Select(a);
Thread.sleep(1000);
b.selectByVisibleText("7");
Thread.sleep(1000);

WebElement m=driver.findElement(By.id("month"));
Select mt= new Select(m);
mt.selectByIndex(4);
Thread.sleep(1000);
WebElement y=driver.findElement(By.id("year"));
Select ye= new Select(y);
ye.selectByValue("2017");





	}

}
