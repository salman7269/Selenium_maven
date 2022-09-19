package selenium_maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_practice {

	public static void main(String[] args) throws AWTException, InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
Robot robot= new Robot();
driver.get("https://demo.guru99.com/test/newtours/");


driver.findElement(By.xpath("(//a[@href=\"register.php\"])[2]")).click();
//driver.findElement(By.linkText("REGISTER")).click();

robot.keyPress(KeyEvent.VK_PAGE_DOWN);

	}

}
