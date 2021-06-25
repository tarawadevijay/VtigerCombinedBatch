package genericLibrary;

import java.io.File;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
/***
 * 
 * @author Sumanth
 *
 */
public class TakeScreenShotUtil implements IAutoConstants {
	
	public void takeScreenshotAndStoreInErrorshots(WebDriver driver,ITestResult result) {
		String localDateTime = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot takescreenshot = (TakesScreenshot)driver;
		File tempFile = takescreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(SCREENSHOT_PATH+result.getMethod().getMethodName()+localDateTime+".png");
		tempFile.renameTo(destFile);
	}
}
