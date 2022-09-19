package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragANDdrop4 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
Thread.sleep(2000);
WebElement source= driver.findElement(By.xpath("(//*[text()='CAT'])[2]"));
Thread.sleep(1000);
WebElement source1= driver.findElement(By.xpath("(//*[text()='HORSE'])[2]"));
Thread.sleep(1000);

WebElement source2= driver.findElement(By.xpath("(//*[text()='TIGER'])[2]"));
Thread.sleep(1000);

WebElement source3= driver.findElement(By.xpath("(//*[text()='DOG'])[2]"));
Thread.sleep(1000);


WebElement target= driver.findElement(By.xpath("//div[@id='dropBox']"));
Thread.sleep(1000);

WebElement target1= driver.findElement(By.xpath("//div[@id='dropBox2']"));


Actions act= new Actions(driver);
act.clickAndHold(source3).dragAndDrop(source3, target1).build().perform();
Thread.sleep(1000);

act.clickAndHold(source2).dragAndDrop(source2, target1).build().perform();
Thread.sleep(1000);
act.clickAndHold(source1).dragAndDrop(source1, target).build().perform();
Thread.sleep(1000);
act.clickAndHold(source).dragAndDrop(source, target1).build().perform();

	}

}
