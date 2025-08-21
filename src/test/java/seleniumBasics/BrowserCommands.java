package seleniumBasics;

public class BrowserCommands extends BaseClass{
	public void verifyCommands() {
		String title = driver.getTitle();
		System.out.println(title);  
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String handleID= driver.getWindowHandle();
		System.out.println(handleID);
		
		String source= driver.getPageSource();
		System.out.println(source);    
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserCommands command = new BrowserCommands();
		command.intialiseBrowser();
		command.verifyCommands();

	}

}
