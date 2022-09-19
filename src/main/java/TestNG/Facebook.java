package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
WebDriver driver;

@BeforeTest
public void setup()
{
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");
	driver= new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
@Test
public void launchingApplication()
{
	driver.get("https://www.facebook.com");
}
@Test
public void validating_application()
{
	SoftAssert SoftAssert= new SoftAssert();
	//asserting_Title
	String expTITLE="Log in to Facebook";
	String actTITLE=driver.getTitle();
	
	SoftAssert.assertEquals(actTITLE, expTITLE,"Failed:- Title is MisMatched");
	
	//asserting_URL
		String expURL="https://www.facebook.com/";
		String actURL=driver.getCurrentUrl();
	SoftAssert.assertEquals(actURL, expURL);
	
	//asserting_Error
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hritik", Keys.ENTER);
	String expERROR="Incorrect Password";
	String actERROR=driver.findElement(By.xpath("//div[@class='clearfix _5466 _44mg']/div[2]")).getText();
SoftAssert.assertEquals(actERROR, expERROR);
Reporter.log(actERROR, true);

}

@AfterTest
public void close()
{
	driver.quit();
}

	
	
}
