package moduleSelenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import suiteBase.Selenium;

public class ModuleSeleniumFirst extends Selenium{
	//Driver object should be accessible - need to import package as well
	public ModuleSeleniumFirst() {
		// TODO Auto-generated constructor stub
	}
	//Maven uses algorithm to detect all test which are having Test keyword concatenated
	@Test
	public void SeleniumBrowserAutomation() {
		System.out.println("ModuleSeleniumFirstTest");
		BrowserAutomation();
	}
	@Test
	public void SeleniumelementsUi() {
		System.out.println("ModuleSeleniumFirstTest");
		elementsUi();
	}
	@BeforeClass(groups="BrowserAutomation",enabled=false)
	public void launchURL() {
		try {
			String url = getValuePropFile("urldemo1");
		driver.navigate().to(url);
		System.out.println(url);
		}catch(Exception e){
			System.out.println("Error while launching the URL");
			e.printStackTrace();
		}
	}
}
