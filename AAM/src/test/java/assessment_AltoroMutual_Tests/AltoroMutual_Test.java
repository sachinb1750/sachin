package assessment_AltoroMutual_Tests;

/**
 * Exception Handling is done in Common Functions
 * Created Common Function so as to reuse code being used in each Page Object File 
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import assessment_AltoroMutual_Utils.BaseClass;
import assessment_AltoroMutual_pages.AltoroMutual_AccountInformationPage;
import assessment_AltoroMutual_pages.AltoroMutual_LoginPage;
import assessment_AltoroMutual_pages.AltoroMutual_OnlineBankingHome;
import assessment_AltoroMutual_pages.AltoroMutual_TransferFundPage;

public class AltoroMutual_Test extends BaseClass {
	WebDriver driver;

	// Page Objects - Using Page Factory for implementation of Page Object Model
	AltoroMutual_LoginPage loginPageObj = null;
	AltoroMutual_OnlineBankingHome onlineBankingHomeObj = null;
	AltoroMutual_TransferFundPage transferFundPageObj = null;
	AltoroMutual_AccountInformationPage accountInformationPageObj = null;

	// SoftAssert objects - Using Soft assertions for Verification Steps
	SoftAssert softA1 = new SoftAssert(); // login_page_test
	SoftAssert softA2 = new SoftAssert(); // online_banking_home_page_test
	SoftAssert softA3 = new SoftAssert(); // transfer_fund_page_test
	SoftAssert softA4 = new SoftAssert(); // account_information_page_test

	/*
	 * Not using Hard Assertions here because that is explicitly handled in Common
	 * Function where we are performing operations and validations
	 */

	@Test(enabled = true)
	public void login_page_test() {
		System.out.println("Login Page Test :::::::::::::::::::::::::::::::::::::::::::");
		try {
			/*
			 * Driver is initialized with given URL for Class here due to dependency of
			 * Tests which are part of One E2E Test Case ) and Re-usability
			 */
			System.out.println("Starting");
			this.driver = BaseClass.driver;

			// Initializing Page Object
			loginPageObj = PageFactory.initElements(driver, AltoroMutual_LoginPage.class);

			/*
			 * 1) On the login page, verify that AltoroMutual logo image is displayed in top
			 * left
			 */
			loginPageObj.verifyElement(loginPageObj.logo);

			/*
			 * 2) Verify that following four tabs are displayed at the top: ONLINE BANKING
			 * LOGIN, PERSONAL, SMALL BUSINESS and INSIDE ALTORO MUTUAL
			 */
			String tabText1 = "ONLINE BANKING LOGIN";
			String tabText2 = "PERSONAL";
			String tabText3 = "SMALL BUSINESS";
			String tabText4 = "INSIDE ALTORO MUTUAL";

			softA1.assertEquals(loginPageObj.verifyElement(loginPageObj.tab1).contains(tabText1), true);
			softA1.assertEquals(loginPageObj.verifyElement(loginPageObj.tab2).contains(tabText2), true);
			softA1.assertEquals(loginPageObj.verifyElement(loginPageObj.tab3).contains(tabText3), true);
			softA1.assertEquals(loginPageObj.verifyElement(loginPageObj.tab4).contains(tabText4), true);

			System.out.println("Tab is present :" + loginPageObj.verifyElement(loginPageObj.tab1).toString());
			System.out.println("Tab is present :" + loginPageObj.verifyElement(loginPageObj.tab2).toString());
			System.out.println("Tab is present :" + loginPageObj.verifyElement(loginPageObj.tab3).toString());
			System.out.println("Tab is present :" + loginPageObj.verifyElement(loginPageObj.tab4).toString());

			/*
			 * 3) Verify that when user enters incorrect username and password then
			 * following Login Failed message should be displayed.
			 */
			loginPageObj.setCredentials(property.getProperty("incuser"), property.getProperty("incpass"));
			loginPageObj.performClick(loginPageObj.clickLogin);

			String errorMessage = "Login Failed: We're sorry, but this username or password was not found in our system. Please try again.";
			softA1.assertEquals(loginPageObj.verifyElement(loginPageObj.loginError).contains(errorMessage), true);

			System.out.println("Error message is present : "
					+ loginPageObj.verifyElement(loginPageObj.loginError).contains(errorMessage));

			// Trying to Login with Valid Credentials
			loginPageObj.setCredentials(property.getProperty("user"), property.getProperty("pass"));
			loginPageObj.performClick(loginPageObj.clickLogin);

			/*
			 * 4) Verify that when user enters valid username and password then Online
			 * Banking Home page should be displayed.
			 */
			String name = "John Smith";
			softA1.assertEquals(loginPageObj.verifyElement(loginPageObj.welcomeUser).contains(name), true);

			System.out.println("Logged in With : " + name + " :"
					+ (loginPageObj.verifyElement(loginPageObj.welcomeUser).contains(name)));

			// Test Case status will be fail in case any test step get failed
			softA1.assertAll();

		} catch (Exception e) {
			System.out.println("Exception Occurred : Test Case Execution Stopped : " + BaseClass.getTestRunId());
		}
	}

	@Test(dependsOnMethods = "login_page_test", enabled = true)
	public void online_banking_home_page_test() {
		System.out.println("Online Banking Home Page Test :::::::::::::::::::::::::::::");
		try {
			// Initializing Page Object
			onlineBankingHomeObj = PageFactory.initElements(driver, AltoroMutual_OnlineBankingHome.class);

			/*
			 * 1) Select a bank account in View Account Details dropdown and click on GO
			 * button
			 */
			onlineBankingHomeObj.verifyElement(onlineBankingHomeObj.selectlistAccounts);
			onlineBankingHomeObj.performSelectElementByValue(onlineBankingHomeObj.selectlistAccounts,
					property.getProperty("accountID"));
			onlineBankingHomeObj.performClick(onlineBankingHomeObj.getAccount);

			/*
			 * 2) Verify Account Information page is displayed. Also verify that account
			 * number displayed in heading Account History - <Account no.> is same as bank
			 * account selected in above step
			 */
			String verifyAccount = property.getProperty("accountID");
			softA2.assertEquals(
					onlineBankingHomeObj.verifyElement(onlineBankingHomeObj.verifyAccount).contains(verifyAccount),
					true);

			System.out.println("Selected Account is Displayed : "
					+ onlineBankingHomeObj.verifyElement(onlineBankingHomeObj.verifyAccount).contains(verifyAccount));

			/*
			 * 3) Verify that current date is displayed in Balance Detail table (Ending
			 * balance as of <Date>)
			 */
			softA2.assertEquals(onlineBankingHomeObj.verifyTodayDateMMDDYY(onlineBankingHomeObj.verifyDateText), true);

			System.out.println("Current date is displayed in Balance Detail table : "
					+ onlineBankingHomeObj.verifyTodayDateMMDDYY(onlineBankingHomeObj.verifyDateText));

			// Test Case status will be fail in case any test step get failed
			softA2.assertAll();
		} catch (Exception e) {
			System.out.println("Exception Occurred : Test Case Execution Stopped : " + BaseClass.getTestRunId());
		}
	}

	@Test(dependsOnMethods = "online_banking_home_page_test", enabled = true)
	public void transfer_fund_page_test() {
		System.out.println("Transfer Fund Page Test :::::::::::::::::::::::::::::::::::");

		try {
			// Initializing Page Object
			transferFundPageObj = PageFactory.initElements(driver, AltoroMutual_TransferFundPage.class);

			/*
			 * 1) Click on Transfer Funds link in left hand navigation section, verify that
			 * Transfer Funds page is displayed
			 */
			transferFundPageObj.performClick(transferFundPageObj.linkTransferFunds);
			transferFundPageObj.verifyElement(transferFundPageObj.hTransferFunds);

			/*
			 * 2) Select From Account, To Account and Amount to Transfer and click on
			 * Transfer Money button
			 */
			String transferAmount = property.getProperty("transferAmount");
			String fromAccount = property.getProperty("fromAccount");
			String toAccount = property.getProperty("toAccount");

			transferFundPageObj.performSelectElementByValue(transferFundPageObj.selectfromAccount, fromAccount);
			transferFundPageObj.performSelectElementByValue(transferFundPageObj.selecttoAccount, toAccount);
			transferFundPageObj.performSendKeys(transferFundPageObj.inputAmount, transferAmount);
			transferFundPageObj.performClick(transferFundPageObj.trasferMoney);

			/*
			 * 3) Verify that a message is displayed with correct amount and from/to account
			 * details
			 */
			String actual = transferFundPageObj.verifyElement(transferFundPageObj.verifytransferMessage);
			boolean verifyTranMessageDetails;

			verifyTranMessageDetails = actual.contains(transferAmount) && actual.contains(fromAccount)
					&& actual.contains(toAccount);
			softA3.assertEquals(verifyTranMessageDetails, true);

			System.out.println("Message contains correct amount and from/to account details "+actual );
			
			// Test Case status will be fail in case any test step get failed
			softA3.assertAll();
		} catch (Exception e) {
			System.out.println("Exception Occurred : Test Case Execution Stopped : " + BaseClass.getTestRunId());
		}
	}

	@Test(dependsOnMethods = "transfer_fund_page_test", enabled = true)
	public void account_information_page_test() {
		System.out.println("Login Page Test :::::::::::::::::::::::::::::::::::::::::::");
		try {
			// Initializing Page Object
			accountInformationPageObj = PageFactory.initElements(driver, AltoroMutual_AccountInformationPage.class);

			/* 1) Click on View Account Summary link in left hand navigation section */
			accountInformationPageObj.performClick(accountInformationPageObj.accountSummary);

			/*
			 * 2) Select From account (same as used before) in the dropdown and click on GO
			 * button
			 */
			accountInformationPageObj.performSelectElementByValue(accountInformationPageObj.selectlistAccounts,
					property.getProperty("fromAccount"));
			accountInformationPageObj.performClick(accountInformationPageObj.getAccount);

			/*
			 * 3) Verify that an entry is present in the Recent Transaction table for
			 * transaction done instead of Debits as suggested by Sinduja on Transfer Funds
			 * page. Verify that the amount is same as entered while transferring funds.
			 */
			String tranAmount = property.getProperty("transferAmount");
			String tranDateFormat = property.getProperty("tranDateFormat");

			String tranDescFrom = property.getProperty("tranDescFrom");
			softA4.assertEquals(accountInformationPageObj.verifyTransaction(tranDateFormat, tranDescFrom, tranAmount),
					true);

			/*
			 * 4) Select To Account (same as used before) in dropdown present inside Balance
			 * Detail table and click on Select Account button.
			 */
			accountInformationPageObj.performSelectElementByValue(accountInformationPageObj.selectlistAccounts,
					property.getProperty("toAccount"));
			accountInformationPageObj.performClick(accountInformationPageObj.getAccount);

			/*
			 * 5) Verify that an entry is present in the Credits table for transaction done
			 * on Transfer Funds page. Verify that the amount is same as entered while
			 * transferring funds.
			 */
			String tranDescTo = property.getProperty("tranDescTo");
			softA4.assertEquals(accountInformationPageObj.verifyTransaction(tranDateFormat, tranDescTo, tranAmount),
					true);

			/* 6) Click on Sign off link at the top and verify that user is signed off. */
			accountInformationPageObj.performClick(accountInformationPageObj.signOff);
			String verifySigInPageText = "Sign";
			softA4.assertEquals(accountInformationPageObj.verifyElement(accountInformationPageObj.signIn)
					.contains(verifySigInPageText), true);

			// Test Case status will be fail in case any test step get failed
			softA4.assertAll();
		} catch (Exception e) {
			System.out.println("Exception Occurred : Test Case Execution Stopped : " + BaseClass.getTestRunId());
		}
	}
}
