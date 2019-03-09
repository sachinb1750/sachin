package assessment_AltoroMutual_Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import assessment_AltoroMutual_Utils.BaseClass;
import assessment_AltoroMutual_pages.AltoroMutual_AccountInformationPage;
import assessment_AltoroMutual_pages.AltoroMutual_LoginPage;
import assessment_AltoroMutual_pages.AltoroMutual_OnlineBankingHome;
import assessment_AltoroMutual_pages.AltoroMutual_TransferFundPage;

public class AltoroMutual_Test extends BaseClass {
	WebDriver driver;
	AltoroMutual_LoginPage loginPageObj = null;
	AltoroMutual_OnlineBankingHome onlineBankingHomeObj = null;
	AltoroMutual_TransferFundPage transferFundPageObj = null;
	AltoroMutual_AccountInformationPage accountInformationPageObj = null;

	@Test(enabled = true)
	public void login_page_test() {
		System.out.println("Login Page Test :::::::::::::::::::::::::::::::::::::::::::");
		try {

			this.driver = BaseClass.driver;

			loginPageObj = PageFactory.initElements(driver, AltoroMutual_LoginPage.class);

			loginPageObj.verifyElement(loginPageObj.logo);

			loginPageObj.verifyElement(loginPageObj.tab1);

			loginPageObj.verifyElement(loginPageObj.tab2);

			loginPageObj.verifyElement(loginPageObj.tab3);

			loginPageObj.verifyElement(loginPageObj.tab4);

			loginPageObj.setCredentials(property.getProperty("incuser"), property.getProperty("incpass"));

			loginPageObj.performClick(loginPageObj.clickLogin);

			loginPageObj.verifyElement(loginPageObj.loginError);

			loginPageObj.setCredentials(property.getProperty("user"), property.getProperty("pass"));
			Thread.sleep(5000);
			loginPageObj.performClick(loginPageObj.clickLogin);
			Thread.sleep(5000);
			loginPageObj.verifyElement(loginPageObj.welcomeUser);

		} catch (Exception e) {
			System.out.println("Exception Occurred : Test Case Execution Stopped : " + BaseClass.getTestRunId());
		}
	}

	@Test(dependsOnMethods = "login_page_test", enabled = true)
	public void online_banking_home_page_test() {
		System.out.println("Online Banking Home Page Test :::::::::::::::::::::::::::::");

		onlineBankingHomeObj = PageFactory.initElements(driver, AltoroMutual_OnlineBankingHome.class);

		onlineBankingHomeObj.verifyElement(onlineBankingHomeObj.selectlistAccounts);

		onlineBankingHomeObj.performSelectElementByValue(onlineBankingHomeObj.selectlistAccounts,
				property.getProperty("accountID"));

		onlineBankingHomeObj.performClick(onlineBankingHomeObj.getAccount);

		onlineBankingHomeObj.verifyElement(onlineBankingHomeObj.verifyAccount);

		onlineBankingHomeObj.verifyDateMMDDYY(onlineBankingHomeObj.verifyDate, "/");

	}

	@Test(dependsOnMethods = "online_banking_home_page_test", enabled = true)
	public void transfer_fund_page_test() {
		System.out.println("Transfer Fund Page Test :::::::::::::::::::::::::::::::::::");
		transferFundPageObj = PageFactory.initElements(driver, AltoroMutual_TransferFundPage.class);

		transferFundPageObj.performClick(transferFundPageObj.linkTransferFunds);

		transferFundPageObj.verifyElement(transferFundPageObj.hTransferFunds);

		transferFundPageObj.performSelectElementByValue(transferFundPageObj.selectfromAccount,
				property.getProperty("fromAccount"));

		transferFundPageObj.performSelectElementByValue(transferFundPageObj.selecttoAccount,
				property.getProperty("toAccount"));

		transferFundPageObj.performSendKeys(transferFundPageObj.inputAmount, property.getProperty("transferAmount"));

		transferFundPageObj.performClick(transferFundPageObj.trasferMoney);

		transferFundPageObj.verifyElement(transferFundPageObj.verifytransferMessage);
	}

	@Test(dependsOnMethods = "transfer_fund_page_test", enabled = true)
	public void account_information_page_test() {
		System.out.println("Login Page Test :::::::::::::::::::::::::::::::::::::::::::");
		try {
		accountInformationPageObj = PageFactory.initElements(driver, AltoroMutual_AccountInformationPage.class);

		accountInformationPageObj.performClick(accountInformationPageObj.accountSummary);

		accountInformationPageObj.performSelectElementByValue(accountInformationPageObj.selectlistAccounts,
				property.getProperty("fromAccount"));
		
		accountInformationPageObj.performClick(accountInformationPageObj.getAccount);
		
		String tranAmount = property.getProperty("transferAmount");
		String tranFormat = property.getProperty("tranFormat");
		
		String tranDescFrom = property.getProperty("tranDescFrom");
		accountInformationPageObj.verifyTransaction(tranFormat,tranDescFrom,tranAmount);
		
		accountInformationPageObj.performSelectElementByValue(accountInformationPageObj.selectlistAccounts,
				property.getProperty("toAccount"));
		
		accountInformationPageObj.performClick(accountInformationPageObj.getAccount);
	
		String tranDescTo = property.getProperty("tranDescTo");
		accountInformationPageObj.verifyTransaction(tranFormat,tranDescTo,tranAmount);
		
		accountInformationPageObj.performClick(accountInformationPageObj.signOff);
		
		accountInformationPageObj.verifyElement(accountInformationPageObj.signIn);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
