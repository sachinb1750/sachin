package testNGPractice;

import org.testng.annotations.Test;

public class GroupsExample {

	@Test(groups= {"regression","sanity"})
	public void m1(){
		System.out.println("inside m1");
	}
	
	@Test(groups="regression")
	public void m2(){
		System.out.println("inside m2");
	}
	
	@Test()
	public void m3(){
		System.out.println("inside m3");
	}
}
