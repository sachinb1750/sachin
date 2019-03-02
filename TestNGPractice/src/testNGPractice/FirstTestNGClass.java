package testNGPractice;

import org.junit.Assert;
import org.testng.annotations.Test;

public class FirstTestNGClass extends InitialTest {
	
	@Test()
	public void FirstClass_method1() {
		System.out.println("Inside  FirstClass_method1");
		//Assert.fail();
	}
	
	
	  @Test() 
	  public void  FirstClass_method2() 
	  { 
		  System.out.println("Inside  FirstClass_method2"); 
		}
	  
	  
	  @Test() 
	  public void  FirstClass_method3() 
	  { 
		  System.out.println("Inside  FirstClass_method3"); 
		}
	 

}
