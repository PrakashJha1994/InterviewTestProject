package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
//private By loginSuccess=By.xpath("//*[@title='Clarion Promise']");
	private By loginSuccess=By.linkText("HOME");	
	public WebElement getLoginSuccess()
	{
		return driver.findElement(loginSuccess);
		
	}
	
private By log_promise=By.linkText("Log Promise");
	
	public WebElement getLog_promise()
	{
		return driver.findElement(log_promise);
		
	}
	
	//Promises To
private By promiseTo=By.linkText("Promises To");
	
	public WebElement getpromiseTo()
	{
		return driver.findElement(promiseTo);
		
	}
private By logout=By.linkText("LOGOUT");
	
	public WebElement getlogout()
	{
		return driver.findElement(logout);
		
	}
	
	
}
