package genericLibrary;

import org.testng.ITestContext;
/*
 * ShraddhaBagoji
 */
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
/***
 * 
 * @author Sumanth
 *
 */
public class ListenerImplementation extends BaseTest implements ITestListener {
	
	public void onFinish(ITestContext arg0) {					
	
	}
	
	public void onStart(ITestContext arg0) {								

	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {								

	}
	
	public void onTestFailure(ITestResult result) {					
		TakeScreenShotUtil screenshot=new TakeScreenShotUtil();
		screenshot.takeScreenshotAndStoreInErrorshots(driver,result);  		
	}		

	public void onTestSkipped(ITestResult arg0) {					
		
	}		

	public void onTestStart(ITestResult arg0) {					
		
	}	
	
	public void onTestSuccess(ITestResult arg0) {					
		
	}
}
