package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
		Actions act= new Actions(driver);
WebElement oslo =driver.findElement(By.xpath("(//*[text()=\"Oslo\"])[2]"));
WebElement stockholm =driver.findElement(By.xpath("(//*[text()=\"Stockholm\"])[2]"));
WebElement washington =driver.findElement(By.xpath("(//*[text()=\"Washington\"])[2]"));
WebElement copenhagen =driver.findElement(By.xpath("(//*[text()=\"Copenhagen\"])[2]"));
WebElement seoul =driver.findElement(By.xpath("(//*[text()=\"Seoul\"])[2]"));
WebElement rome =driver.findElement(By.xpath("(//*[text()=\"Rome\"])[2]"));
WebElement madrid =driver.findElement(By.xpath("(//*[text()=\"Madrid\"])[2]"));
WebElement italy =driver.findElement(By.xpath("(//*[text()=\"Italy\"])"));
WebElement spain =driver.findElement(By.xpath("(//*[text()=\"Spain\"])"));
WebElement norway =driver.findElement(By.xpath("(//*[text()=\"Norway\"])"));
WebElement denmark =driver.findElement(By.xpath("(//*[text()=\"Denmark\"])"));
WebElement southKorea =driver.findElement(By.xpath("(//*[text()=\"South Korea\"])"));
WebElement sweden =driver.findElement(By.xpath("(//*[text()=\"Sweden\"])"));
WebElement US =driver.findElement(By.xpath("(//*[text()=\"United States\"])"));
Thread.sleep(2000);

act.dragAndDrop(madrid, spain).build().perform();
Thread.sleep(2000);
act.dragAndDrop(rome, italy).build().perform();
Thread.sleep(2000);
act.dragAndDrop(seoul, southKorea).build().perform();
Thread.sleep(2000);
act.dragAndDrop(washington, US).build().perform();
Thread.sleep(2000);
act.dragAndDrop(copenhagen, denmark).build().perform();
Thread.sleep(2000);
act.dragAndDrop(stockholm, norway).build().perform();
Thread.sleep(2000);
act.dragAndDrop(oslo, sweden).build().perform();


	}

}
