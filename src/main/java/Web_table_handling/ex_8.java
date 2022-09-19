package Web_table_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_8 {

	public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
FirefoxOptions opt = new FirefoxOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new FirefoxDriver(opt);
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
int row= driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr")).size();
System.out.println("The number of Rows are:- "+row);

int column = driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[2]/td")).size();
System.out.println("The number of columns are:- "+column);

for(int i=2; i<=row; i++)
{
	for(int j=1;j<=column;j++)
	{
		System.out.print(driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"      ");
	}
	
	System.out.println();
}
	}

}
