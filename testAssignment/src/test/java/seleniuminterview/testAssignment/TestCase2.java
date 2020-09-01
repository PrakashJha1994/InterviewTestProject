package seleniuminterview.testAssignment;

import java.io.IOException;
import commonUtil.TestUtilities;
import pages.HomePage;
import pages.LoginPage;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 extends TestUtilities {

	

	@BeforeClass
	public void initialbrowser() throws IOException
	{
	
		intializebrowser();			
	}
	@Test
	public void validateLoginSuccess() throws Exception
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getUsername().sendKeys("sanjeetk@clariontechnologies.co.in");
		loginpage.getPassword().sendKeys("clarion");
		loginpage.getSubmit().click();
		HomePage hp=new HomePage(driver);
		System.out.println(hp.getLoginSuccess().getText());
		Assert.assertEquals(hp.getLoginSuccess().getText(), "HOME");
		System.out.println("Login success");
		
		
	}
	
	@AfterClass
	public void destroy()
	{
		driver.close();
	}
	
	

}
