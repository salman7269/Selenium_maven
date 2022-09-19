package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deleteallcookies {

	public static void main(String[] args) {

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
	
	driver.manage().deleteAllCookies();
	Set<Cookie>c2=driver.manage().getCookies();

	System.out.println("The Number of cookie:- "+c2.size());
	if(c2.size()==0)
	{
		System.out.println("All Cookies are deleted");
	}
	else
	{
		System.out.println("All Cookies are not deleted");
	}
	
	driver.close();
	}

}
