package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_google {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
driver.findElement(By.name("q")).sendKeys("Amazon.com", Keys.ENTER);

driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/div/a/h3")).click();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Teddy Bear", Keys.ENTER);
JavascriptExecutor js= (JavascriptExecutor)driver;

driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/div[1]/div/div/div/div/a[2]/div")).click();

js.executeScript("window.scrollBy(0,500)");
Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[7]/div[4]/div[1]/div[5]/div/div/div/div/form/div/div/div/div/div[3]/div/div[32]/div[1]/span/span/span/input")).click();


driver.navigate().to("https://www.google.co.in/");
	}

}
