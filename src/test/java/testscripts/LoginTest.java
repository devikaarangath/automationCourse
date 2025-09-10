package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.DemoBase;

public class LoginTest extends DemoBase {
	
//	@Test
	public void verifyLoginWithValidCredentials() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterPasswordOnPasswordField();
		loginpage.enterUsernameOnUsernameField();
		loginpage.clickOnLoginButton();
		

}
	
	@Test
	public void verifyLoginWithInValidUserNameAndValidPassword () {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("devika");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();

			
		}
	@Test
	public void verifyLoginWithValidUserNameInvalidPassword() {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("ytre");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();

			
		}
	@Test
	public void verifyLoginWithInValidCredentials() {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("devika");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("ytryu");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();

			
		}
	

}
