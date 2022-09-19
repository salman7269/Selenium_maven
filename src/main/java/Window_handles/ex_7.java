package Window_handles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex_7 {

	public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
FirefoxOptions opt= new FirefoxOptions();
opt.addArguments("--disable-notifications");
WebDriver driver = new FirefoxDriver(opt);

driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Tab");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[text()='Click Here']")).click();

Set<String> windowids=driver.getWindowHandles();
System.out.println(windowids+" ");

Iterator<String> it=windowids.iterator();
String parentwindow=it.next();
String childwindow=it.next();

driver.switchTo().window(childwindow);
String exptitle =driver.getTitle();
//Frames and Window Dummy Testing Site - GlobalSQA
System.out.println(exptitle);
driver.findElement(By.xpath("//li[@id='menu-item-7128']")).click();
String acttitle=driver.getTitle();
//Free Ebooks - GlobalSQA
System.out.println(acttitle);

if(exptitle.equals(acttitle))
{
	System.out.println("Child element is NOT CLICKED");
}
else
{
	System.out.println("Child element is CLICKED");
}

driver.switchTo().window(parentwindow);
	}

}
