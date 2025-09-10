package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pratice extends BaseClass {
	
	public void dropDown() {
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select select = new Select(dropdown);
		//select.selectByIndex(1);
		//select.selectByValue("testng");
		select.selectByVisibleText("Maven");
		
		
	}
	public void checkBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement check = driver.findElement(By.xpath("//input[@value='option-1']"));
		check.click();
		
		System.out.println(check.getText());
	}

	public static void main(String[] args) {
		Pratice example = new Pratice();
		example.intialiseBrowser();
		//example.dropDown();
		example.checkBox();
		
		

	}

}
