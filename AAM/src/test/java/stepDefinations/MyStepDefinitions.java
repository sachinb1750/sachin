package stepDefinations;

import org.junit.runner.RunWith;

import assessment_AltoroMutual_Tests.AltoroMutual_Test;
import assessment_AltoroMutual_Utils.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
//	Hooks hookObj = new Hooks();
	AltoroMutual_Test test = new AltoroMutual_Test();
	
	@Given("^login page test$")
	public void login_page_test() {
	    // Write code here that turns the phrase above into concrete actions
		Hooks.test.assignCategory("Test_Level_Report");
		BaseClass.testLevelReport.set(Hooks.test);
		test.login_page_test();
		BaseClass.extent.flush();
	}

	@When("^online banking home page test$")
	public void online_banking_home_page_test() {
	    // Write code here that turns the phrase above into concrete actions
		Hooks.test.assignCategory("Test_Level_Report");
		BaseClass.testLevelReport.set(Hooks.test);
	    test.online_banking_home_page_test();
	    BaseClass.extent.flush();
	}

	@When("^transfer fund page test$")
	public void transfer_fund_page_test() {
	    // Write code here that turns the phrase above into concrete actions
		Hooks.test.assignCategory("Test_Level_Report");
		BaseClass.testLevelReport.set(Hooks.test);
	    test.transfer_fund_page_test();
	    BaseClass.extent.flush();
	}

	@Then("^account information page test$")
	public void account_information_page_test() {
	    // Write code here that turns the phrase above into concrete actions
		Hooks.test.assignCategory("Test_Level_Report");
		BaseClass.testLevelReport.set(Hooks.test);
	    test.account_information_page_test();
	    BaseClass.extent.flush();
	}
}