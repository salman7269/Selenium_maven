package Web_table_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_4 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		int row=driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr")).size();
		System.out.println("The Number of ROWS are:- "+row);
		int column = driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td")).size();
		System.out.println("The Number of COLUMNS are:- "+ column);
		//*[@id="countries"]/tbody/tr[2]/td[2]
		
		for(int i=2; i<=row; i++)
		{
			for(int j=1; j<=column; j++)
			{
				System.out.print(driver.findElement(By.xpath("	//*[@id=\"countries\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+"       ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
