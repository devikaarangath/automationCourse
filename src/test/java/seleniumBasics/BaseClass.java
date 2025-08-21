package seleniumBasics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public WebDriver driver;


public void intialiseBrowser() {
	driver = new ChromeDriver();
//	driver = new FirefoxDriver();
	WebDriverManager.chromedriver().setup();
//	WebDriverManager.edgedriver()
//	.clearResolutionCache()
//    .forceDownload()
//    .setup();
//	driver = new EdgeDriver();
	
	driver.get("https://selenium.qabible.in/");
	driver.manage().window().maximize();
	
}
public void browserclose() {
	//driver.close();
	//driver.quit();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass base= new BaseClass();
		base.intialiseBrowser();
		base.browserclose();

	}

}
