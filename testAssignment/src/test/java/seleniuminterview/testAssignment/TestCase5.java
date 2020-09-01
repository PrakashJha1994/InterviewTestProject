package seleniuminterview.testAssignment;

import java.io.IOException;
import commonUtil.TestUtilities;
import pages.HomePage;
import pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase5 extends TestUtilities {
	@BeforeClass
	public void initialbrowser() throws IOException
	{
	
		intializebrowser();			
	}
	@Test
	public void validateLogout() throws Exception
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getUsername().sendKeys("sanjeetk@clariontechnologies.co.in");
		loginpage.getPassword().sendKeys("clarion");
		loginpage.getSubmit().click();
		HomePage hp=new HomePage(driver);
		Assert.assertEquals(hp.getLoginSuccess().getText(), "HOME");
		hp.getlogout().click();
		Assert.assertEquals(loginpage.getUsername().getText(),"");
		
		
	}
	
	@AfterClass
	public void destroy()
	{
		driver.close();
	}
	
	
	

}
