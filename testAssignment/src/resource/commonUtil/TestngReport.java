package commonUtil;


import java.util.List;
import java.util.Map;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class TestngReport implements IReporter {
	//private ExtentReports extent;
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

		// extent = new ExtentReports(outputDirectory + File.separator + "TestReports.html", true);
		for (ISuite suite : suites) {
			String suiteName=suite.getName();
            Map<String, ISuiteResult> result = suite.getResults();
 
            for (ISuiteResult r : result.values()) {
                ITestContext context = r.getTestContext();
 
                System.out.println("Passed tests for suite '" + suiteName +
                        "' is:" + context.getPassedTests().getAllResults().size());
                     System.out.println("Failed tests for suite '" + suiteName +
                        "' is:" + context.getFailedTests().getAllResults().size());
                     System.out.println("Skipped tests for suite '" + suiteName +
                        "' is:" + context.getSkippedTests().getAllResults().size());
            }
        }	
		// extent.flush();
	       // extent.close();
	}

}
