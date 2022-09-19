package Web_table_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_7 {

	public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
WebDriver driver = new FirefoxDriver();
driver.get("https://demoqa.com/webtables");
int column = driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div")).size();
System.out.println("The Number of columns are:- "+column);
int row=driver.findElements(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div")).size();
System.out.println("The number of rows are:- "+row);
//	
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=column;j++)
		{
			System.out.print(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div["+i+"]/div/div["+j+"]")).getText()+"      ");
		}
		
		System.out.println();

	}
	}

}
