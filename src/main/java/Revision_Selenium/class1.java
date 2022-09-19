package Revision_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class1 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://stqatools.com/demo/WebTable.php");

int rows=driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/table/tbody/tr")).size();
int columns=driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/table/tbody/tr[1]/td")).size();
System.out.println("The number of rows are:- "+rows);
System.out.println("The number of columns are:- "+columns);
System.out.println("--------------------------------------------------------------------");
WebElement heading=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/table/thead/tr"));
System.out.println(heading.getText()+"         ");
for(int i=1; i<=rows; i++)
{
	for(int j=1; j<=columns; j++)
	{
	System.out.print(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"         ");
	}

System.out.println();
}

	}

}
