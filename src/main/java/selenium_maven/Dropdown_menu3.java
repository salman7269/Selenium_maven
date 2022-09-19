package selenium_maven;
import java.util.List;

//there are two types of dropdown :-
//1)static dropdown--->in which select is present as a tagname
//2)dynamic dropdown-->in which selct is not present
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_menu3 {

	public static void main(String[] args) throws InterruptedException {

		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/select-menu");
Thread.sleep(1000);
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,600)");
Thread.sleep(1000);
WebElement ele =driver.findElement(By.xpath("//select[@id=\"cars\"]"));
		
Select s= new Select(ele); //select object is used to instantiate the methods of selecting webelement
System.out.println("Verify Is it multiselected dropdown:- "+s.isMultiple());//to verify whether dropdown is multiselected dropdown or not.
s.selectByVisibleText("Volvo");
Thread.sleep(1000);
s.selectByValue("opel");
Thread.sleep(1000);
s.selectByIndex(3);
Thread.sleep(1000);
s.selectByValue("saab");
		
System.out.println("Size of selected option:- "+ s.getAllSelectedOptions().size());//to get the size of selected option
Thread.sleep(1000);
s.deselectByIndex(0);
Thread.sleep(1000);
s.deselectByIndex(3);
Thread.sleep(1000);
s.deselectByIndex(2);
Thread.sleep(1000);
s.deselectByIndex(1);
System.out.println("Size after deselect option:- "+ s.getAllSelectedOptions().size());
Thread.sleep(1000);
System.out.println("Size of options present:- "+s.getOptions().size());

List<WebElement> li=s.getOptions();	
for(int i=0; i< li.size(); i++)
{
	System.out.println(li.get(i).getText());
}
	}

}
