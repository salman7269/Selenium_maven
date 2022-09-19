package orangeHRM;
//editing personal information
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//scenario to add personal details in OrangeHRM
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editing_Personal_Detail {

public static void main(String[] args) throws InterruptedException, AWTException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin", Keys.ENTER);
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123", Keys.ENTER);
Thread.sleep(3000);
driver.findElement(By.xpath("//b[normalize-space()='My Info']")).click();
Thread.sleep(3000);


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

driver.findElement(By.cssSelector("#btnSave")).click();
Thread.sleep(2000);
robot.keyPress(KeyEvent.VK_UP);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_UP);
Thread.sleep(1000);
WebElement ele =driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
ele.clear();
ele.sendKeys("Shaikh", Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[contains(@title,\"Middle Name\")]")).clear();
WebElement ele1 =driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']"));
ele1.clear();
ele1.sendKeys("Salman", Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='personal_txtOtherID']")).sendKeys("786", Keys.ENTER);
Thread.sleep(1000);
WebElement ele4=driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']"));
ele4.clear();
ele4.sendKeys("1999-07-11", Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='personal_txtNICNo']")).sendKeys("123456", Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='personal_txtSINNo']")).sendKeys("654132", Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.name("personal[optGender]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//select[@id='personal_cmbNation']")).sendKeys("indian", Keys.ENTER);
Thread.sleep(1000);
WebElement ele5=driver.findElement(By.xpath("//input[@id='personal_DOB']"));
ele5.clear();
ele5.sendKeys("2032-08-15", Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("//select[@id='personal_cmbNation']")).sendKeys("indian", Keys.ENTER);
Thread.sleep(1000);

WebElement ele2 =driver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']"));
ele2.clear();
ele2.sendKeys("Sallu", Keys.ENTER);
Thread.sleep(2000);

WebElement ele3 =driver.findElement(By.xpath("//input[@id='personal_txtMilitarySer']"));
ele3.clear();
ele3.sendKeys("Ex Army Commando", Keys.ENTER);
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@id='personal_chkSmokeFlag']")).click();
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@id='btnSave']")).click();

	}

}
