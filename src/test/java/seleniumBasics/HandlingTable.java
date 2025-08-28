package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable  extends BaseClass{
	public void handleTable() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table = driver.findElement(By.xpath("//table[@id='dataTable']"));
		WebElement row = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]"));
		System.out.println(table.getText());
		System.out.println(row.getText());
	}

	public static void main(String[] args) {
		HandlingTable handlingtable = new HandlingTable();
		handlingtable.intialiseBrowser();
		handlingtable.handleTable();
		

	}

}
