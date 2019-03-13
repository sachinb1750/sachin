package assessment_AltoroMutual_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import assessment_AltoroMutual_Utils.CommonFunctions;

public class AltoroMutual_AccountInformationPage {
	WebDriver driver;
	@FindBy(linkText = "View Account Summary")
	public WebElement accountSummary;

	@FindBy(xpath = "//select[@name='listAccounts']")
	public WebElement selectlistAccounts;

	@FindBy(xpath = "//input[@id='btnGetAccount']")
	public WebElement getAccount;

	@FindBy(xpath = "//td[contains(text(),'Ending balance as of')]")
	public WebElement verifyDate;

	@FindBy(xpath = "//div[@id='recent']//tr")
	public List<WebElement> recentTran;

	@FindBy(xpath = "//font[contains(text(),'Sign Off')]")
	public WebElement signOff;
	
	@FindBy(xpath = "//font[contains(text(),'Sign In')]")
	public WebElement signIn;
	
	public void performSendKeys(WebElement element, String keys) throws Exception {
		CommonFunctions.performSendKeys(element, keys);
	}

	public String verifyElement(WebElement element) throws Exception {
		return CommonFunctions.verifyElement(element);
	}

	public void performSelectElementByValue(WebElement element, String value) throws Exception {
		CommonFunctions.performSelectElementByValue(element, value);
	}

	public void performClick(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		CommonFunctions.performClick(element);
	}
	
	public boolean verifyTransaction(String format, String desc, String amount) throws Exception {
		return CommonFunctions.verifyTransaction(recentTran, format, desc, amount);
	}
}
