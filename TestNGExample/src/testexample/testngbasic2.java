package testexample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngbasic2 {
	
	//Before containing folder
	@AfterTest
	public void demo2_demo1() {
		System.out.println("Hello : I am in Demo : 2 Demo 1 - Test Example Function : After test");
	}
	//After containing folder
	@BeforeTest
	public void demo2_demo2() {
		System.out.println("Hello : I am in Demo : 2 Demo 2 - Test Example Function : Before test");
	}
	@Test
	public void sachin1() {
		System.out.println("Hello : I am in Demo : 2 Test Example Function");
	}
	@Test
	public void sachin2() {
		System.out.println("Hello : I am in Demo : 2 Test Example Function");
	}
	@BeforeSuite
	public void startExecution() {
		System.out.println("Execution is started");
		//We can write here environment here
	}
	@AfterSuite
	public void endExecution() {
		System.out.println("Execution is ended");
		//we can use according to us
		
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Start Test Case");
		//Delete cookie before each test
		//login before each test
	}
	@AfterMethod
	public void afetrMethod() {
		System.out.println("End Test Case");
	}
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
	}
	@Test
	public void tc2() {
		System.out.println("Test Case 2");
	}
}
