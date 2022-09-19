package selenium_maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.KeyDownAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addCART {

	public static void main(String[] args) throws InterruptedException, AWTException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();

driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Rose",Keys.ENTER);
Thread.sleep(4000);


JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,300)");
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@title='Flipkart Perfect Homes Rose Stick Artificial Flower for Home and Office Décor Red Rose Artificial Flower']")).click();
Thread.sleep(2000);
Robot robot= new Robot();


robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);

String currentTab = driver.getWindowHandle(); //get window handles method can helps in accessing new window.
for (String tab : driver.getWindowHandles()) {
    if (!tab.equals(currentTab)) {
        driver.switchTo().window(tab); 
    }       
}
driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("450331", Keys.ENTER);
Thread.sleep(3000);
driver.findElement(By.xpath("//span[@class='YxlyDn']")).click();
Thread.sleep(6000);




	}

}
