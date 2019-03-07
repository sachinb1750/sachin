package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

import org.demo.selenium.pages.MercuryFindFlightPage;
import org.demo.selenium.pages.MercuryLoginPage;
import org.demo.selenium.utils.BaseClass;
import org.demo.selenium.utils.DriverManager;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends BaseClass {
	public static WebDriver driver;
	MercuryLoginPage loginPage;
	MercuryFindFlightPage mercuryFindFlightPage;

	@Given("^Initialize the browser with Chrome$")
	public void initialize_the_browser_with_Chrome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
//		DriverManager dm = new DriverManager();
		driver = DriverManager.getDriverInstance("chrome", 20);
		System.out.println("Launched Chrome");
	}

	@When("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver = DriverManager.getDriver();
		driver.get(arg1);
		System.out.println("Launched Mercury Tours Site");

	}

//	@When("^User enters user \"([^\"]*)\" and password \"([^\"]*)\"$")
//	public void user_enters_user_and_password(String arg1, String arg2) throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		// throw new PendingException();
//		loginPage = new MercuryLoginPage(driver);
//		mercuryFindFlightPage = loginPage.performMercuryLogin(arg1, arg2);
//
//	}

//	@Then("^User Logged in \"([^\"]*)\"$")
//	public void user_Logged_in(String arg1) throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		// throw new PendingException();
//		// mercuryFindFlightPage = new MercuryFindFlightPage(driver);
//		mercuryFindFlightPage.validateMercuryFindFlightPage();
//		driver.quit();
//	}

	@Then("^User Logged in (.+)$")
	public void user_logged_in(String flag) throws Throwable {
//		throw new PendingException();
		mercuryFindFlightPage.validateMercuryFindFlightPage();

	}

	@Then("^Close Browser$")
	public void close_Browser(DataTable dt) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		System.out.println(dt.getGherkinRows().size());
		System.out.println(dt.getGherkinRows().get(0).getCells());
		System.out.println(dt.getGherkinRows().get(1).getCells());
		DriverManager.killDriverInstance();
	}

	@And("^User enters user (.+) and password (.+)$")
	public void user_enters_user_and_password(String username, String password) throws Throwable {
		// throw new PendingException();
		loginPage = new MercuryLoginPage(driver);
		mercuryFindFlightPage = loginPage.performMercuryLogin(username, password);
	}
}