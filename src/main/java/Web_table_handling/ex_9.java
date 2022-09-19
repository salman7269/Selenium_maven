package Web_table_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_9 {

public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();
ChromeOptions opt = new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new ChromeDriver(opt);
driver.get("https://www.globalsqa.com/");
driver.manage().window().maximize();
JavascriptExecutor js =(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,300)");

int row=driver.findElements(By.xpath("//*[@id=\"post-1397\"]/div[2]/div/div/div[1]/div[2]/div/div[1]/table/tbody/tr")).size();
System.out.println("The Number of Rows are:- "+row);

int column=driver.findElements(By.xpath("//*[@id=\"post-1397\"]/div[2]/div/div/div[1]/div[2]/div/div[1]/table/tbody/tr[2]/td")).size();
System.out.println("The Number of columns are:- "+column);

JavascriptExecutor js1 =(JavascriptExecutor) driver;
js1.executeScript("window.scrollBy(0,300)");

for(int i=2; i<=row; i++)
{
	for(int j=1; j<=column; j++)
	{
		System.out.print(driver.findElement(By.xpath("//*[@id=\"post-1397\"]/div[2]/div/div/div[1]/div[2]/div/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"      ");
	}

	System.out.println();
}

	}

}
