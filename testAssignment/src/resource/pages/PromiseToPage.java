package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PromiseToPage {
	WebDriver driver;
	public PromiseToPage(WebDriver driver) {
		this.driver=driver;
	}
private By selectPromise=By.name("cboEmp");
	
	public WebElement getPromise()
	{
		Select sp=new Select(driver.findElement(selectPromise));
		sp.selectByVisibleText("Sonali test");
		return sp.getFirstSelectedOption();
	}
	
private By startDate=By.id("idImg1");
private By todayDate=By.xpath("//td[contains(@class,'day')and contains(@class,'selected')]");
	
	public void getStartDate()
	{
		driver.findElement(startDate).click();
		
		driver.findElement(todayDate).click();
		
	}
	
	
private By endDate=By.id("idImg2");
private By todayEndDate=By.xpath("//td[contains(@class,'day')and contains(@class,'selected')]");	
	public void getEndDate()
	{
		driver.findElement(endDate).click();
		driver.findElements(todayEndDate).get(1).click();
		
	}
		
	public WebElement getPromiseList(String Promise)
	{
	 By promiseList=By.xpath("//td[contains(text(),'"+Promise+"')]");

		return driver.findElement(promiseList);
		
	}
private By searchPromise=By.name("btnSearch");
	
	public WebElement getSearchPromise()
	{
		return driver.findElement(searchPromise);
		
	}
}
