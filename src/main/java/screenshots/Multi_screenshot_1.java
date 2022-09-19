package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Multi_screenshot_1 {

	public static void main(String[] args) throws IOException {
		  WebDriverManager.chromedriver().setup();
			ChromeOptions opt= new ChromeOptions();
			opt.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		TakesScreenshot ts= (TakesScreenshot) driver;	
			File src=ts.getScreenshotAs(OutputType.FILE);
			String str= RandomString.make(4);
			File trg= new File("D:\\screenshot\\fb"+str+".jpg");
			FileUtils.copyFile(src, trg);
			
	}

}
