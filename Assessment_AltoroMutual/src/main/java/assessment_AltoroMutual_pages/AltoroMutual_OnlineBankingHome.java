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
	public WebElement verifyDate;

	public void performSendKeys(WebElement element, String keys) {
		CommonFunctions.performSendKeys(element, keys);
	}

	public void performClick(WebElement element) {
		CommonFunctions.performClick(element);
	}

	public void verifyElement(WebElement element) {
		CommonFunctions.verifyElement(element);
	}

	public void performSelectElementByValue(WebElement element, String value) {
		CommonFunctions.performSelectElementByValue(element, value);
	}
	public void verifyDateMMDDYY(WebElement element, String seprator) {
		String dateStr = element.getText();
		CommonFunctions.verifyDateMMddyy(dateStr, seprator, "MM/dd/yy");
	}
}
