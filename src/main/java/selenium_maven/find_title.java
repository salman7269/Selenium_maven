package selenium_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class find_title {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.freelancer.com/login");
String exptitle="Login to Hire Freelancers & Find Work | Freelancer";
String acttitle=driver.getTitle();

if (exptitle.equals(acttitle))
{
	System.out.println("Test Pass");
}
else
{
	System.out.println("Test Fail");
}
driver.close();
		
		
		
	}

}
