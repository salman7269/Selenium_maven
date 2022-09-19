package selenium_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getlinktext {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.co.in/");
Thread.sleep(1000);
List <WebElement> li=driver.findElements(By.xpath("//div[@id=\"SIvCob\"]"));
System.out.println(li.size());
Thread.sleep(1000);
for(int i=0; i<li.size(); i++)
{
System.out.println(li.get(i).getText());
}
		
	}

}
