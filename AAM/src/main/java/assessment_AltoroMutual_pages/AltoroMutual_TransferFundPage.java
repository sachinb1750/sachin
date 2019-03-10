package assessment_AltoroMutual_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import assessment_AltoroMutual_Utils.CommonFunctions;

public class AltoroMutual_TransferFundPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Transfer Funds')]")
	public
	WebElement linkTransferFunds;
	
	@FindBy(xpath="//h1[contains(text(),'Transfer Funds')]")
	public
	WebElement hTransferFunds;
	
	@FindBy(xpath="//select[@id='fromAccount']")
	public
	WebElement selectfromAccount;
	
	@FindBy(css="#toAccount")
	public
	WebElement selecttoAccount;
	
	@FindBy(css="#transferAmount")
	public
	WebElement inputAmount;
	
	@FindBy(xpath="//input[@value='Transfer Money']")
	public
	WebElement trasferMoney;
	
	@FindBy(xpath="//span[contains(text(),'was successfully transferred from Account')]")
	public
	WebElement verifytransferMessage;
	
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
}
