package Web_table_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_11 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeOptions opt= new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver= new ChromeDriver();
driver.get("https://nxtgenaiacademy.com/webtable/");

int row=driver.findElements(By.xpath("//*[@id=\"content\"]/article/div/div/section[1]/div/div/div/div/div/table/tbody/tr")).size();
System.out.println("The number of Rows:- "+row);

int column= driver.findElements(By.xpath("//*[@id=\"content\"]/article/div/div/section[1]/div/div/div/div/div/table/tbody/tr[1]/td")).size();
System.out.println("The Number of columns:- "+column);
System.out.println("===================================================================================================");

for(int i=1; i<=row; i++)
{
	for(int j=1; j<=column; j++)
System.out.print(driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/section[1]/div/div/div/div/div/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"                            ");
}
System.out.println();
	
	}

}
