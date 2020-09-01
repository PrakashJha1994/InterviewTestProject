package seleniuminterview.testAssignment;

import java.io.IOException;
import commonUtil.TestUtilities;
import pages.HomePage;
import pages.LogPromisePage;
import pages.LoginPage;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 extends TestUtilities {
	private String message="This is Practise test";
	public String getMessage()
	{
		return message;
	}
	@BeforeClass
	public void initialbrowser() throws IOException
	{
	
		intializebrowser();			
	}
	@Test
	public void addPromise()
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getUsername().sendKeys("sanjeetk@clariontechnologies.co.in");
		loginpage.getPassword().sendKeys("clarion");
		loginpage.getSubmit().click();
		HomePage hp=new HomePage(driver);
		Assert.assertTrue(hp.getLoginSuccess().isDisplayed());
		hp.getLog_promise().click();
		LogPromisePage logpromise=new LogPromisePage(driver);
		Assert.assertEquals(logpromise.getPromise().getText().trim(),"Sonali test");
		logpromise.getTextpromise().sendKeys(message);
		logpromise.getSubmitPromise().click();
		
	}
	
	@AfterClass
	public void destroy()
	{
		driver.close();
	}
	
	
	

}
