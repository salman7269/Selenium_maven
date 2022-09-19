package HeadLess_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_3 {

	public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
FirefoxOptions opt= new FirefoxOptions();
opt.setHeadless(true);
WebDriver driver= new FirefoxDriver(opt);
driver.get("https://www.flipkart.com");
System.out.println("The Title:- "+driver.getTitle());








	}

}
