package HeadLess_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		//opt.setHeadless(true);
		opt.addArguments("--headless");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");
		System.out.println("The TITLE is:- "+driver.getTitle());
		
	}

}
