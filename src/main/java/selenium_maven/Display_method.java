package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Display_method {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://in.indeed.com/jobs?q=freelancer&msclkid=f0f97c1f4a6017ed4d9a1ea6f5658b20&utm_source=bing&utm_medium=cpc&utm_campaign=query_campaign_20220119_0_(phrase)_(en)&utm_term=freelancer%20com&utm_content=freelancer%20com&vjk=4a64f2f6c1cd73ac");
WebElement search = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/div/div/div[1]/form/div/div[1]/div/div[1]/div"));
System.out.println("Dislay Status:- "+search.isDisplayed());
System.out.println("Enable Status:- "+ search.isEnabled());
System.out.println("Select Status:- "+ search.isSelected());


	}

}
