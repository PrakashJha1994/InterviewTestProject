package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LogPromisePage {
	WebDriver driver;
	public LogPromisePage(WebDriver driver) {
		this.driver=driver;
	}
private By selectPromise=By.name("cboEmp");
	
	public WebElement getPromise()
	{
		Select sp=new Select(driver.findElement(selectPromise));
		sp.selectByValue("4FD8CA8F7257FFE0BF0D13098D160895");
		return sp.getFirstSelectedOption();
	}
	
private By textpromise=By.id("txtPromise");
	
	public WebElement getTextpromise()
	{
		return driver.findElement(textpromise);
		
	}
	
private By submitPromise=By.id("btnSubmit");
	
	public WebElement getSubmitPromise()
	{
		return driver.findElement(submitPromise);
		
	}
}
