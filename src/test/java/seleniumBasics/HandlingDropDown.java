package seleniumBasics;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends BaseClass {
	public void verifyDropDown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement drop = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(drop);
		//select.selectByIndex(2);
		//select.selectByValue("sql");
		select.selectByVisibleText("c#");
		
	}
	public void verifyCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement check = driver.findElement(By.xpath("//input[@value='option-1']"));
		check.click();
		System.out.println(check.isSelected());
				
		
		
	}
	public void verifyRadioButton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio = driver.findElement(By.xpath("//input[@value='orange']"));
		
	}

	public static void main(String[] args) {
		HandlingDropDown dropDown = new HandlingDropDown();
		dropDown.intialiseBrowser();
		//dropDown.verifyDropDown();
		dropDown.verifyCheckBox();
		//dropDown.verifyRadioButton();
		
		
	}

}
