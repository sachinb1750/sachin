package assessment_AltoroMutual_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import assessment_AltoroMutual_Utils.CommonFunctions;

public class AltoroMutual_LoginPage{
	WebDriver driver;

	@FindBy(xpath = "//img[@src='/images/logo.gif']")
	public WebElement logo;

	@FindBy(linkText = "ONLINE BANKING LOGIN")
	public WebElement tab1;

	@FindBy(css = "#LinkHeader2")
	public WebElement tab2;

	@FindBy(css = "#LinkHeader3")
	public WebElement tab3;

	@FindBy(css = "#LinkHeader4")
	public WebElement tab4;

	@FindBy(xpath = "//input[@id='uid']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='passw']")
	public WebElement userpwd;

	@FindBy(xpath = "//input[@value='Login']")
	public WebElement clickLogin;

	@FindBy(xpath = "//span[@id='_ctl0__ctl0_Content_Main_message']")
	public WebElement loginError;

	@FindBy(xpath = "//h1[contains(text(),'Hello John Smith')]")
	public WebElement welcomeUser;

	public void setCredentials(String user, String pwd) throws Exception {
		CommonFunctions.setCredentials(userid, userpwd, user, pwd);
	}

	public void performSendKeys(WebElement element, String keys) throws Exception {
		CommonFunctions.performSendKeys(element, keys);
	}

	public void performClick(WebElement element) throws Exception {
		CommonFunctions.performClick(element);
	}

	public String  verifyElement(WebElement element) throws Exception {
		return CommonFunctions.verifyElement(element);
	}
}
