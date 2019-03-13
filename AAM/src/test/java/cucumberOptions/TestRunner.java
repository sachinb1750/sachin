package cucumberOptions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
import org.testng.annotations.BeforeSuite;

//import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
	    plugin     =   {
	    		"html:testResults/cucumber" , 
	    		"json:testResults/cucumber.json",
	    		"pretty"
	    		},
		features   =   {"src/test/java/features"},
		glue       =   {"stepDefinations"},
		tags       =   {"@AltoroMutual"},
		dryRun     =   false,
		strict     =   false,
		monochrome =   false
		)
public class TestRunner extends AbstractTestNGCucumberTests {
//public class TestRunner {
	@BeforeClass()
	static public void beforeClassMethod() {
		System.out.println("Executing Before Class Method");
	}
	@BeforeSuite
	static public void beforeSuiteMethod() {
		System.out.println("beforeSuiteMethod");
	}
	@BeforeMethod()
	static public void beforeMethod() {
		System.out.println("Executing Before Method");
	}

	@AfterMethod
	static public void afterMethod() {
		System.out.println("Printing After Method");
	}

	@AfterClass()
	static public void afterClassMethod() {
		System.out.println("Printing After Class Method");
	}

}