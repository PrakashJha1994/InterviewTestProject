package seleniuminterview.testAssignment;

import java.io.IOException;
import commonUtil.TestUtilities;
import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.PromiseToPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase4 extends TestUtilities {
	@BeforeClass
	public void initialbrowser() throws IOException
	{
	
		intializebrowser();			
	}
	@Test
	public void verifyPromise() throws Exception
	{
	TestCase3 tc3=new TestCase3();
	String message=tc3.getMessage();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getUsername().sendKeys("sanjeetk@clariontechnologies.co.in");
		loginpage.getPassword().sendKeys("clarion");
		loginpage.getSubmit().click();
		HomePage hp=new HomePage(driver);
		hp.getpromiseTo().click();
		PromiseToPage promisepage=new PromiseToPage(driver);
		promisepage.getPromise();
		promisepage.getStartDate();
		promisepage.getEndDate();
		promisepage.getSearchPromise().click();
		Assert.assertEquals(promisepage.getPromiseList(message).getText(), message);
		
		
	}
	
	@AfterClass
	public void destroy()
	{
		driver.close();
	}
	
	

}
