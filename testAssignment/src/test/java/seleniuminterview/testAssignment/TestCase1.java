package seleniuminterview.testAssignment;

import java.io.IOException;
import commonUtil.TestUtilities;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase1 extends TestUtilities {

	@BeforeClass
	public void initialbrowser() throws IOException
	{
	
		intializebrowser();		
		
	}
	@Test
	public void verifyLoginValidation()
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getUsername().sendKeys("");
		loginpage.getPassword().sendKeys("");
		loginpage.getSubmit().click();	
		Assert.assertEquals(loginpage.getusernameValidation().getText(),"Invalid Username/password");
		System.out.println("Validation got success for blank fields");
	}
	
	@AfterClass
	public void destroy()
	{
		driver.close();
		
	}
	
	

}
