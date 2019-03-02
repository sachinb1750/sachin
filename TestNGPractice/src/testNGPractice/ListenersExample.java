package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ListenersExample {
	@AfterSuite
	public void afterSuite(){
		System.out.println("afterSuite");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("afterTest");
	}
	
	@Test(description="method1")
	public void m1(){
		System.out.println("inside m1");
		Assert.fail();
	}
	
	@Test(description="method1")
	public void m(){
		System.out.println("inside m");
	}
	
	@Test(dependsOnMethods={"m1"},priority=1)
	public void m2(){
		System.out.println("inside m2");
	}
	
	@Test(priority=2)
	public void m4(){
		System.out.println("inside m4");
	}
	

}
