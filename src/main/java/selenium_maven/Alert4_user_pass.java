package selenium_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert4_user_pass{

	public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();
ChromeOptions opt = new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/basic_auth");
Thread.sleep(5000);
//to inject username and password, we have to add that in URL
//itself
//syntax:- https://user:pass:@the-internet.herokuapp.com/basic_auth

driver.switchTo().alert().accept();

		
	}

}
