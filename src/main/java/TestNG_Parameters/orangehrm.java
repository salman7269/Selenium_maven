package TestNG_Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrm {

WebDriver driver;


@BeforeMethod
public void setup()
{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
}



@Test(dataProvider="logindata",dataProviderClass=dataorange.class)
public void login(String username, String password) throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	String actURL=driver.getCurrentUrl();
	String ExpURL="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
	Assert.assertEquals(actURL, ExpURL);
}

@AfterMethod
public void TearDown()
{
	driver.close();
}


	
	
}
