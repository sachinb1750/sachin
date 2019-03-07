package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class CalcStepDefinations {
	@Given("^I have entered (\\d+) into the calculator$")
	public void i_have_entered_into_the_calculator(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Entererd First Number : "+arg1);
	   
	}

	@Given("^I have also entered (\\d+) into the calculator$")
	public void i_have_also_entered_into_the_calculator(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Entererd Second Number : "+arg1);
	}

	@When("^I press add$")
	public void i_press_add() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Performing Addition :");
	}

	@Then("^the result should be (\\d+) on the screen$")
	public void the_result_should_be_on_the_screen(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Expected Result is : "+arg1);
	}
}
