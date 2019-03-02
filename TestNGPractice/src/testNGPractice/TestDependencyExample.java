package testNGPractice;

//import org.junit.Assert;
import org.testng.annotations.Test;

public class TestDependencyExample {
	
	@Test(description="method1")
	public void m1(){
		System.out.println("inside m1");
		//Assert.fail();
	}
	
	@Test(description="method1")
	public void m(){
		System.out.println("inside m");
	}
	
	@Test(dependsOnMethods={"m1","m"})
	public void m2(){
		System.out.println("inside m2");
	}
	

}
