package Revision_Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {

	public static void main(String[] args) throws IOException {
WebDriverManager.chromedriver().setup();
ChromeOptions opt= new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver = new ChromeDriver(opt);
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500)");

WebElement src1=driver.findElement(By.xpath("//*[text()='Mr John']"));
WebElement src2=driver.findElement(By.xpath("//*[text()='Mary']"));
WebElement trg=driver.findElement(By.xpath("//*[@id='trash']"));

Actions act= new Actions(driver);
act.dragAndDrop(src1, trg).build().perform();
act.dragAndDrop(src2, trg).build().perform();

WebElement src3=driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
act.clickAndHold(src3).dragAndDropBy(src3, 300, 0).build().perform();

WebElement section=driver.findElement(By.xpath("//div[@id='sidebar-right-1']"));
File src=section.getScreenshotAs(OutputType.FILE);
File trg1= new File("D:\\screenshot\\sectionsn.jpg");
FileUtils.copyFile(src, trg1);

List<WebElement> li=driver.findElements(By.xpath("(//div[@class='widget-content'])[4]"));
System.out.println("size:- "+li.size());
for(int i=0; i<li.size(); i++)
{
	System.out.println(li.get(i).getText());
}
}
}