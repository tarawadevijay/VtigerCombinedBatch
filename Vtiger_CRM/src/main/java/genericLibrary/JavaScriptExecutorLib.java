package genericLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/***
 * 
 * @author Sumanth
 *
 */
public class JavaScriptExecutorLib {

	WebDriver driver;
	JavascriptExecutor javaScript = (JavascriptExecutor) driver;
	
	public JavaScriptExecutorLib(WebDriver driver) {
		driver=this.driver;
	}
	
	public void jsClick(WebElement element) {
		javaScript.executeScript("arguments[0].click();", element);
	}

	public void jsSendkeys(String data,WebElement element) {
		javaScript.executeScript("arguments[0].value='"+data+"';", element);
	}
	
	public void jsScrollBy(int x,int y) {
		javaScript.executeScript("arguments[0].scrollBy("+x+","+y+")");
	}

	public void jsScrollIntoView(boolean a,WebElement element) {
		javaScript.executeScript("arguments[0].scrollIntoView("+a+")",element);
	}

	public void jsScrollTo(int x,int y,WebElement element) {
		javaScript.executeScript("arguments[0].scrollTo("+x+","+y+")",element);
	}

	public void jsScrollToBottomOfThePage() {
		javaScript.executeScript("arguments[0].scrollBy(0,document.body.scrollHeight')");
	}
	
	public String jsFetchVale(WebElement element) {
		return (String)javaScript.executeScript("return arguments[0].value",element);
	}
	
	public void jsRefresh() {
		javaScript.executeScript("history.go(0)");
	}
	
	public void jsClear(WebElement element) {
		javaScript.executeScript("arguments[0].vlue='';",element);
	}
	
	public void toPutABorderOnWebElement(WebElement element) {
		javaScript.executeScript("arguments[0].style.border='3px solid red';",element);
	}
	
	public void toChangeTheColorOfWebElement(String color,WebElement element) {
		javaScript.executeScript("arguments[0].style.backgroundColor = '"+color+"';",element);
	}
}

