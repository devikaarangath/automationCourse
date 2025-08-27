package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pratice extends BaseClass {
	
	public void dropDown() {
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		
	}

	public static void main(String[] args) {
		Pratice example = new Pratice();
		example.intialiseBrowser();
		example.dropDown();
		
		

	}

}
