package selenium_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findelements2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        List<WebElement>li=driver.findElements(By.xpath("//a"));
        System.out.println("The size:- "+li.size());
for(int i=0; i<li.size();i++)
{
	System.out.println(li.get(i).getText());
}


	}

}
