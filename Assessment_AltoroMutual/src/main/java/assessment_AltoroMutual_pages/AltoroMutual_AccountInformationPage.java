package assessment_AltoroMutual_pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import assessment_AltoroMutual_Utils.BaseClass;
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
	
	public void performSendKeys(WebElement element, String keys) {
		CommonFunctions.performSendKeys(element, keys);
	}

	public void verifyElement(WebElement element) {
		CommonFunctions.verifyElement(element);
	}

	public void performSelectElementByValue(WebElement element, String value) {
		CommonFunctions.performSelectElementByValue(element, value);
	}

	public void performClick(WebElement element) {
		// TODO Auto-generated method stub
		CommonFunctions.performClick(element);
	}
	
	public void verifyTransaction(String format, String desc, String amount) {
		CommonFunctions.verifyTransaction(recentTran, format, desc, amount);
	}
}
