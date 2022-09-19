package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getcookies {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Set<Cookie> cookie= driver.manage().getCookies();
		
	System.out.println("The number of cookies are:- "+cookie.size()); //getting number of cookies
		
	for(Cookie name:cookie)
	{
	System.out.println("Cookie name:- "+name.getName()+":"+ name.getValue());//getting cookies with their values
	}
		
		
	}

}
