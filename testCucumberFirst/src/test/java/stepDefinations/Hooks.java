package stepDefinations;

import org.testng.asserts.SoftAssert;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void beforeCucumber() {
		System.out.println("Cucumber API Before");
		SoftAssert asSoftAssert = new SoftAssert();
		asSoftAssert.assertEquals(true, false);
	}
	@After
	public void afterCucumber() {
		System.out.println("Cucumber API After");
	}
}
