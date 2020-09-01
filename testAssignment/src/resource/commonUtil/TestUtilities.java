package commonUtil;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;

public class TestUtilities {
	public static  WebDriver driver=null;
	public void intializebrowser() throws IOException
	{
		String url="http://182.74.238.209/clarion_promise_qa/index.php";
		File f=new File("src/driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",f.getPath());
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("headless");
		 driver=new ChromeDriver(opt);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		 driver.get(url);
		
		
	}
	
	public void getScreenshot() throws IOException
	{
		TakesScreenshot tsScreenshot= (TakesScreenshot) driver;
		File srcfile= tsScreenshot.getScreenshotAs(OutputType.FILE);
		 File destFile = new File("src/outputscreenshot/snapshot_"+Calendar.getInstance().getTimeInMillis()+".png");
		 FileUtils.copyFile(srcfile, destFile);
	}
	
	
}
