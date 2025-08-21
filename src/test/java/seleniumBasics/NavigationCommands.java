package seleniumBasics;

public class NavigationCommands extends BaseClass {
	public void verifyCommands() {
		//to used to navigate to different pages of  same app or to different app
		driver.navigate().to("https://www.amazon.in/"); // navigate to obsqura site to amazon site
		driver.navigate().back();//
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) {
		
		NavigationCommands navigate = new NavigationCommands();
		navigate.intialiseBrowser();
		navigate.verifyCommands();
		
		
		
		// TODO Auto-generated method stub

	}

}
