package HeadLess_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 What is Headless Testing?
-----------------------------
Ans:- executing the webpage of the application without GUI of that application.
Headless browsers act as a normal browsers, only the difference is we can't interact with GUI.
Most Popular Headless browsers are:-
1)Chrome
2)Firefox
3)HTMLunitDriver
4)PhantomJS

Why it is required?
---------------------
Ans:-1)To rapidly test the application in various browsers without interacting with GUI, headless testing is
required. 
2)While performing the parallel testing, and to avoid the UI browsers to consume the memory.
3)when machine does not have GUI.

DISAdvantanges of Headless browsers Testing:-
-----------------------------------------------
1)Hard to Debug the failure cause.
2)Difficult to take screenshot because GUI is not there.
3)Most user doesn't recommend this headless browsers.


 
 
 
 
 
 
 * 
 */
public class ex_1_Intro {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		opt.setHeadless(true);
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://demoqa.com/alerts");
		System.out.println("The TITLE is:- "+driver.getTitle());
		
		
		
		
		
	}

}
