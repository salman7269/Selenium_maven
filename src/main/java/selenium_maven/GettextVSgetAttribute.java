package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GettextVSgetAttribute {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		
driver.get("https://www.nopcommerce.com/en/login");
 driver.findElement(By.name("Username")).sendKeys("salmankhan", Keys.ENTER);
driver.findElement(By.name("Password")).sendKeys("pass123");

WebElement ele=  driver.findElement(By.name("Username"));
System.out.println("Attribute value:- "+ele.getAttribute("value"));
WebElement ele1= driver.findElement(By.name("Password"));
System.out.println("Text value :- "+ele1.getText());
	}

}
