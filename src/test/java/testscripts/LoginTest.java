package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.DemoBase;
import utilities.ExcelUtility;

public class LoginTest extends DemoBase {
	
	@Test
	public void verifyLoginWithValidCredentials() throws IOException {
		String usernameValue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterPasswordOnPasswordField(usernameValue);
		loginPage.enterUsernameOnUsernameField(passwordvalue);
		loginPage.clickOnLoginButton();
		

}
	
	@Test
	public void verifyLoginWithInValidUserNameAndValidPassword () throws IOException {
		String usernameValue = ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterPasswordOnPasswordField(usernameValue);
		loginPage.enterUsernameOnUsernameField(passwordvalue);
		loginPage.clickOnLoginButton();

			
		}
	@Test
	public void verifyLoginWithValidUserNameInvalidPassword() throws IOException {
		String usernameValue = ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterPasswordOnPasswordField(usernameValue);
		loginPage.enterUsernameOnUsernameField(passwordvalue);
		loginPage.clickOnLoginButton();

			
		}
	@Test
	public void verifyLoginWithInValidCredentials() throws IOException {
		String usernameValue = ExcelUtility.getStringData(3, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterPasswordOnPasswordField(usernameValue);
		loginPage.enterUsernameOnUsernameField(passwordvalue);
		loginPage.clickOnLoginButton();
		

			
		}
	

}
