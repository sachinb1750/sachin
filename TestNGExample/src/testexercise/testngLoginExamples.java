package testexercise;

import org.testng.annotations.Test;

public class testngLoginExamples {
	@Test(enabled=false)
	public void webLogin() {
		System.out.println("Hello : I am in Web Login Examples - Test Exercise Function");
	}
	@Test(timeOut=4000)
	public void mobileLogin() throws InterruptedException {
		Thread.sleep(5000);
		//If don't want to wait for any test 
		//or to make wait for some time for specific time
		System.out.println("Hello : I am in Mobile Login Examples - Test Exercise Function");
	}
	@Test(dependsOnMethods="apiLogin2")
	public void apiLogin1() {
		System.out.println("Hello : I am in API Login Examples 1 - 3 - Test Exercise Function");
	}
	@Test(dependsOnMethods="apiLogin4")
	public void apiLogin2() {
		System.out.println("Hello : I am in API Login Examples 2 - 2 - Test Exercise Function");
	}
	@Test(dependsOnMethods="apiLogin1")
	public void apiLogin3() {
		System.out.println("Hello : I am in API Login Examples 3 - 4 - Test Exercise Function");
	}
	@Test
	public void apiLogin4() {
		System.out.println("Hello : I am in API Login Examples 4 - 1- Test Exercise Function");
	}
}
