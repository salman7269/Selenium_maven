package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucedemo {
WebDriver driver;

	@FindBy(xpath="//input[@id='user-name']") private WebElement username1;
	@FindBy(xpath="//input[@id='user-name']") private WebElement username2;
	@FindBy(xpath="//input[@id='user-name']") private WebElement username3;
	@FindBy(xpath="//input[@id='user-name']") private WebElement username4;
	
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//input[@id='login-button']") private WebElement login;
	
public saucedemo(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void username1()
{
	username1.sendKeys("standard_user");
}
public void username2()
{
	username2.sendKeys("locked_out_user");
}
public void username3()
{
	username3.sendKeys("problem_user");
}
public void username4()
{
	username4.sendKeys("performance_glitch_user");
}
public void password()
{
	password.sendKeys("secret_sauce");
}
	
public void login()
{
	login.click();
}
}
