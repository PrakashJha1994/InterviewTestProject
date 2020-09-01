package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
private By username=By.xpath("//input[@name='txtUsername']");
	
	public WebElement getUsername()
	{
		return driver.findElement(username);
		
	}
	
private By password=By.name("txtPassword");
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	
private By usernameValidation=By.xpath("//font[@color='red']");
	
	public WebElement getusernameValidation()
	{
		return driver.findElement(usernameValidation);
		
	}
private By submit=By.xpath("//input[@type='Submit']");
	
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
		
	}
	
}
