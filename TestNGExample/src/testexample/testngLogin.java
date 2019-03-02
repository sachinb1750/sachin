package testexample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngLogin {
	@Test
	public void webLogin() {
		System.out.println("Hello : I am in Web Login - Test Example Function : Included");
	}
	@Test
	public void mobileLogin() {
		System.out.println("Hello : I am in Mobile Login - Test Example Function");
	}
	@Test
	public void apiLogin() {
		System.out.println("Hello : I am in API Login - Test Example Function");
	}
	
	//Applicable to that class only
	@BeforeClass
	public void beforeClassTestExample() {
		System.out.println("I am now going to Login : testngLogin");
		
	}
	@AfterClass
	public void afterClassTestExample() {
		System.out.println("I am Logged In : testngLogin");
		
	}
}
