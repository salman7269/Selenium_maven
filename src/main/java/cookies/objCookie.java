package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class objCookie {

	public static void main(String[] args) {
//purpose of creating the object of cookie is to add the cookie to browser.
		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		Cookie cobj= new Cookie("MyCookie","123456");
		driver.manage().addCookie(cobj);
		Set<Cookie> c=driver.manage().getCookies();
		
	System.out.println("The Number of cookie:- "+c.size());
	
	for(Cookie name:c)
	{
	System.out.println(name.getName()+":"+name.getValue());
	}
		
		
	}

}
