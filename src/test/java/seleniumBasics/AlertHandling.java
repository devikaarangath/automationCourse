package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends BaseClass{
	public void Simplealert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement button = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		button.click();
		Alert alert=driver.switchTo().alert();
		//System.out.println(alert.getText());
		alert.accept();
		
	}
public void ConformationAlert() {
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement conformation = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	conformation.click();
	Alert alertconformation=driver.switchTo().alert();
	//alertconformation.dismiss();
}
public void PromptAlert() {
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement prompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	prompt.click();
	Alert alertprompt = driver.switchTo().alert();
	alertprompt.sendKeys("devika");
	alertprompt.accept();
	
	
	
}
	public static void main(String[] args) {
		AlertHandling alerthandling = new AlertHandling();
		alerthandling.intialiseBrowser();
		//alerthandling.Simplealert();
		//alerthandling.ConformationAlert();
		alerthandling.PromptAlert();
		
		
		

	}

}
