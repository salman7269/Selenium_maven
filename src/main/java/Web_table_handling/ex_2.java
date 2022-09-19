package Web_table_handling;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_2 {
//getting data of one column and total rows.
	public static void main(String[] args) throws IOException {
WebDriverManager.chromedriver().setup();
ChromeOptions opt = new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver = new ChromeDriver();
driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

////*[@id="customers"]/tbody/tr[6]/td[1]
////*[@id='customers']/tbody/tr[i]/td[1]
for(int i=2; i<=7;i++)
{
	// actualxpath=  beforexpath+i+ afterxpath;
WebElement ele=	driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[1]"));
System.out.println(ele.getText());
	}

}}
