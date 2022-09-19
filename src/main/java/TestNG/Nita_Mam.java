package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nita_Mam {
public WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver(); 
	}
	
	@BeforeTest
	public void basicsetUp() {
		driver.manage().window().maximize();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	}
	
	@BeforeClass
	public void launchApp() { 
		driver.get("https://www.facebook.com/");
	}
	
	
	@BeforeMethod
	public void login() {
		System.out.println("Login to facebook");
	}
	
	@Test
	public void verifyUserProfile() {
		System.out.println("Verify that user is logged into the application");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout from facebook");
		
	}
	
	@AfterClass
	public void generateReport(){
		System.out.println("log test execution/generate test report");
	}
	
	@AfterTest
	public void closeDriverInstance() throws InterruptedException{
		driver.close();
	}
		
	@AfterSuite
	public void cleanUp() {
		System.out.println("Perform clean up activity");
	}
	

}
