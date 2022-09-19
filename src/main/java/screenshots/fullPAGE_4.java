package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fullPAGE_4 {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("railyatra", Keys.ENTER);
		driver.findElement(By.xpath("//*[@class=\"LC20lb MBeuO DKV0Md\"]")).click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
WebElement ele =driver.findElement(By.xpath("//input[@id='from_stn_input']"));
		ele.click();
		ele.sendKeys("bhopal");
		driver.findElement(By.xpath("//li[text()='BHOPAL JN | BPL']")).click();
WebElement ele1= driver.findElement(By.xpath("//input[@id='to_stn_input']"));
	ele1.click();
	ele1.sendKeys("lucknow");
	driver.findElement(By.xpath("//li[text()='LUCKNOW | LKO']")).click();
	js.executeScript("window.scrollBy(0,800)");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg= new File("D:\\\\screenshot\\\\railyatri.jpg");
	FileUtils.copyFile(src, trg);
	
	System.out.println("Screenshot captured successfully");
	driver.close();
	}

}
