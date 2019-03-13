package assessment_AltoroMutual_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import assessment_AltoroMutual_Utils.CommonFunctions;

public class AltoroMutual_OnlineBankingHome {
	WebDriver driver;

	@FindBy(xpath = "//select[@name='listAccounts']")
	public WebElement selectlistAccounts;

	@FindBy(xpath = "//input[@id='btnGetAccount']")
	public WebElement getAccount;

	@FindBy(xpath = "//h1[contains(text(),'Account History -')]")
	public WebElement verifyAccount;

	@FindBy(xpath = "//td[contains(text(),'Ending balance as of')]")
	public WebElement verifyDateText;

	public void performSendKeys(WebElement element, String keys) throws Exception {
		CommonFunctions.performSendKeys(element, keys);
	}

	public void performClick(WebElement element) throws Exception {
		CommonFunctions.performClick(element);
	}

	public String verifyElement(WebElement element) throws Exception {
		return CommonFunctions.verifyElement(element);
	}

	public void performSelectElementByValue(WebElement element, String value) throws Exception {
		CommonFunctions.performSelectElementByValue(element, value);
	}

	public boolean verifyTodayDateMMDDYY(WebElement element) throws Exception {
		String dateStr = element.getText();
		return CommonFunctions.verifyTodayDateMMddyy(dateStr, "/", "MM/dd/yy");
	}
}
