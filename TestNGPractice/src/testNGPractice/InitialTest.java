package testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class InitialTest {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("inside before suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("inside before Test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("inside before class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("inside before method");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("inside after suite");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("inside afterTest ");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("inside after class");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("inside after method");
	}

}
