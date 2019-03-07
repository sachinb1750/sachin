package cucumberOptions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
	    plugin     =   {"html:target/cucumber" , "json:target/cucumber.json" },
		features   =   {"src/test/java/features"},
		glue       =   {"stepDefinations"},
		tags       =   {"@Login"},
		dryRun     =   false,
		strict     =   false,
		monochrome =   false
		)

public class TestRunner extends AbstractTestNGCucumberTests{ 
	@BeforeClass()
	static public void beforeClassMethod(){
		System.out.println("Executing Before Class Method");
	}


	@Before()
	static public void beforeMethod(){
		System.out.println("Executing Before Method");
	}

	@After()
	static public void afterMethod(){
		System.out.println("Printing After Method");
	}

	@AfterClass()
	static public void afterClassMethod(){
		System.out.println("Printing After Class Method");
	}

}