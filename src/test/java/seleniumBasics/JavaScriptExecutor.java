package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor extends BaseClass {
	public void verifyJavaScript() 
	{
        driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  //casting
		js.executeScript("arguments[0].click();", showMessageButton);  // for click function
		
		js.executeScript("window.scrollBy(0,350)", "");  //0-vertical (x axis)
		js.executeScript("window.scrollBy(0,-350)", "");
		
	}

	public static void main(String[] args) {
		
		JavaScriptExecutor javascript = new JavaScriptExecutor();
		javascript.intialiseBrowser();
		javascript.verifyJavaScript();

	}

}
