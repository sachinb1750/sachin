package moduleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ModuleSeleniumLEARN extends ModuleSeleniumFirst {
	public ModuleSeleniumLEARN() {
		// TODO Auto-generated constructor stub
	}
	
	@Test(enabled=false,groups="BrowserAutomation")
	public void mouseHoverExample() throws InterruptedException {
		System.out.println("In ModuleSeleniumLEARNTest");
		WebElement mouseHover = driver.findElement(By.xpath("//button[@id='mousehover']"));
		Actions action = new Actions(driver);
		action.moveToElement(mouseHover);
		System.out.println("Moved to element :"+mouseHover.getText());
		Thread.sleep(2000);
		WebElement topMouseHover = driver.findElement(By.xpath("//a[test()='Top']"));
		topMouseHover.click();
		System.out.println("Clicked on element : "+topMouseHover.getText());
	}
	
	
}
