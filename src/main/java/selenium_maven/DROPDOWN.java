package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DROPDOWN {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeOptions opt = new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver = new ChromeDriver(opt);
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,300)");
driver.get("https://demoqa.com/checkbox");
driver.findElement(By.xpath("//*[@class='rct-collapse rct-collapse-btn']")).click();
Thread.sleep(1000);
WebElement ele= driver.findElement(By.xpath("//*[text()='Home']"));
System.out.println("Home Selected "+ele.isSelected());
System.out.println("Home Displayed "+ele.isDisplayed());
System.out.println("Home enable? "+ele.isEnabled());

driver.findElement(By.xpath("(//*[@class='rct-checkbox'])[1]")).click();
Thread.sleep(5000);
System.out.println("Now Home Selected? "+ele.isSelected());
System.out.println(ele.getSize());

	}

}
