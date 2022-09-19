package orangeHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.util.Times;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploading_contact_details {

	public static void main(String[] args) throws InterruptedException, AWTException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//Thread.sleep(2000);
Robot robot= new Robot();
robot.keyPress(KeyEvent.VK_DOWN);
//Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
//Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
//Thread.sleep(1000);

driver.findElement(By.id("txtUsername")).sendKeys("Admin",Keys.ENTER);
driver.findElement(By.id("txtPassword")).sendKeys("admin123",Keys.ENTER);
//Thread.sleep(2000);

driver.findElement(By.xpath("//b[normalize-space()='My Info']")).click();
//Thread.sleep(3000);

robot.keyPress(KeyEvent.VK_DOWN);
//Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
//Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
//Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
//Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
//Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
//Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[2]/a")).click();
//Thread.sleep(1000);
driver.findElement(By.id("btnSave")).click();
driver.findElement(By.id("contact_street1")).clear();
//Thread.sleep(1000);
driver.findElement(By.id("contact_street1")).sendKeys("T.I.T COLONY", Keys.ENTER);
//Thread.sleep(1000);
driver.findElement(By.id("contact_street2")).clear();
driver.findElement(By.id("contact_street2")).sendKeys("Azadnagar", Keys.ENTER);
//Thread.sleep(1000);
driver.findElement(By.name("contact[city]")).clear();
//Thread.sleep(1000);
driver.findElement(By.name("contact[city]")).sendKeys("Burhanpur", Keys.ENTER);
//Thread.sleep(1000);

JavascriptExecutor js=  (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,300)");
driver.findElement(By.name("contact[province]")).clear();
driver.findElement(By.name("contact[province]")).sendKeys("MadhyaPradesh", Keys.ENTER);
//Thread.sleep(1000);
driver.findElement(By.name("contact[emp_zipcode]")).clear();
driver.findElement(By.name("contact[emp_zipcode]")).sendKeys("450331", Keys.ENTER);
//Thread.sleep(1000);
driver.findElement(By.name("contact[emp_hm_telephone]")).clear();
driver.findElement(By.name("contact[emp_hm_telephone]")).sendKeys("07325-256549", Keys.ENTER);
//Thread.sleep(1000);

driver.findElement(By.name("contact[emp_mobile]")).clear();
driver.findElement(By.name("contact[emp_mobile]")).sendKeys("8085633329", Keys.ENTER);
//Thread.sleep(1000);

driver.findElement(By.name("contact[emp_work_email]")).clear();
driver.findElement(By.name("contact[emp_work_email]")).sendKeys("sallu5269@gmail.com", Keys.ENTER);
//Thread.sleep(1000);

driver.findElement(By.name("contact[emp_oth_email]")).clear();
driver.findElement(By.name("contact[emp_oth_email]")).sendKeys("aalishanmasale@gmail.com", Keys.ENTER);
//Thread.sleep(1000);

driver.findElement(By.id("btnSave")).click();


	}

}
