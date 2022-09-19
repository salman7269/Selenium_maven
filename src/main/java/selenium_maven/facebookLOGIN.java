package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookLOGIN {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
WebElement ele=driver.findElement(By.xpath("//input[@id='u_8_b_im']"));
System.out.println("Display Status:- "+ ele.isDisplayed());
System.out.println("Enable Status:- "+ ele.isEnabled());
System.out.println("Enable Status:- "+ ele.isSelected());
driver.close();
	}

}
