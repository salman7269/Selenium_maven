package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class priority_testCases {

	

	//as we have already seen that methods are executed according to alphabetical order.
   //but when we specify priority to the method at that time it will execute according to the priority.
		@Test(priority=2,description="This is Second to execute", invocationCount=3)
	public void orangehrm1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("TITLE :-"+title);
		
	}
		@Test(priority=1, description="This is first to execute")
	public void orangehrm2()
	{
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.youtube.com/");
	}
		
	}


