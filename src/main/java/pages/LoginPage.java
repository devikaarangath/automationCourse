package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	//constructor creation is mandatory in 
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="user-name") private WebElement username;
	@FindBy(id="password") private WebElement password; 
	@FindBy(id="login-button")private WebElement login;
	
	public void enterUsernameOnUsernameField(String usernameValue) {
		username.sendKeys(usernameValue);
	}
	public void enterPasswordOnPasswordField(String passwordValue) {
		password.sendKeys(passwordValue);
	}
	public void clickOnLoginButton() {
		login.click();
	}

}

