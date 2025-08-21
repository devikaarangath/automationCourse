package seleniumBasics;

import org.openqa.selenium.By;

public class Locators extends BaseClass {
	public void verifyLocators() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.name("description"));
		driver.findElement(By.linkText("Radio Buttons Demo"));
		driver.findElement(By.partialLinkText("Radio "));
		driver.findElement(By.cssSelector("button[id='button-one']"));
//		/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[1]/input
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
