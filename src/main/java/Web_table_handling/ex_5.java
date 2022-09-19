package Web_table_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_5 {

	public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
FirefoxOptions opt= new FirefoxOptions();
opt.addArguments("--disable-notifications");
WebDriver driver = new FirefoxDriver(opt);
driver.get("https://stqatools.com/demo/WebTable.php");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
int column=driver.findElements(By.xpath("//table[@class='table table-hover table-responsive table-list-search']/tbody/tr[1]/td")).size();
System.out.println("Number of columns are:- "+column);
	
int row= driver.findElements(By.xpath("//table[@class='table table-hover table-responsive table-list-search']/tbody/tr")).size();
System.out.println("Number of rows are:- "+row);
for(int k=1;k<=6;k++)
{
	System.out.print(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/table/thead/tr/th["+k+"]")).getText()+"  ");
}
for (int i=2;i<=row; i++)
{
	for(int j=1; j<=column ; j++)
	{
		System.out.print(driver.findElement(By.xpath("//table[@class='table table-hover table-responsive table-list-search']/tbody/tr["+i+"]/td["+j+"]")).getText()+"  ");
	}
	System.out.println();
}

	}

}
