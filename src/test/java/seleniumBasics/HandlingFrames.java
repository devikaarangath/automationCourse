package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends BaseClass {
	public void verifyFrame() {
		driver.navigate().to("https://demoqa.com/frames");	
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		WebElement frameone = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameone);
		WebElement frametext = driver.findElement(By.id("sampleHeading"));
		System.out.println(frametext.getText());
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) {
		
		HandlingFrames frame = new HandlingFrames();
		frame.intialiseBrowser();
		frame.verifyFrame();
		 
		 
		 
		 
	}

}
