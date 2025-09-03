package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public WebDriver driver;
	public void sendkeysForFileUpload() {
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window();
		WebElement browse=driver.findElement(By.xpath("//input[@id='file-upload']"));
		browse.clear();
		browse.sendKeys("\"C:\\Users\\Devika Vysakh\\Downloads\\Manual Testing.pdf\"");
		
	}
	
	public void roboclassForFileupload() throws AWTException {
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement attach = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		attach.click();
		StringSelection stringselect = new StringSelection("\"C:\\Users\\Devika Vysakh\\Downloads\\Manual Testing.pdf\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect,null);
		Robot robot = new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

	public static void main(String[] args) throws AWTException {
		 FileUpload fileupload = new  FileUpload();
		 fileupload.roboclassForFileupload();	
		

	}

}
