package Utilities;

import java.io.IOException;

import org.testng.*;

import com.coverfox.base.base;

public class Listeners extends base implements ITestListener {


	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("Test Cases is started Executing!",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Test Case is Passed!",true);
	}
	

	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("Test Case is Failed! Taking Screenshots",true);
		try {
			utility.takeScreenshots(driver, result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}

	@Override
	public void onStart(ITestContext context) {
		
		Reporter.log("Execution of WebBrowser is Started!",true);
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
		Reporter.log("Execution of WebBrowser is Finished!",true);
	
	}
	

}
