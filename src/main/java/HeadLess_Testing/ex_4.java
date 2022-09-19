package HeadLess_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_4 {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--headless");
	WebDriver driver= new ChromeDriver();
		driver.get("http://in.youtube.com/");
		System.out.println(driver.getTitle());
		
		
	}

}
