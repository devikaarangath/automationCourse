package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends BaseClass {
	public void verifyWebElements() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox = driver.findElement(By.id("single-input-field"));
		messagebox.sendKeys("devika");
		WebElement showbutton = driver.findElement(By.id("button-one"));
		showbutton.click();
		WebElement yourmessage = driver.findElement(By.id("message-one"));
		System.out.println(yourmessage.getText());
		
	}
	
	

	public static void main(String[] args) {
		WebElementCommands cmds = new WebElementCommands();
		cmds.intialiseBrowser();
		cmds.verifyWebElements();
		

	}

}
