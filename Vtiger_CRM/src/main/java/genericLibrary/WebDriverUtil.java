package genericLibrary;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/***
 * 
 * @author Sumanth
 *
 */
public class WebDriverUtil {

	WebDriver driver;

	public WebDriverUtil(WebDriver driver) {
		this.driver=driver;
	}

	public void switchToASpecificTitledWindow(String title) {
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String windowId:allWindowIds){
			driver.switchTo().window(windowId);
			if(driver.getTitle().equalsIgnoreCase(title)){
				break;
			}
		}
	}
}
