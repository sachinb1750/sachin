package testNGPractice;

import org.testng.annotations.Test;

public class SecondTestNG extends InitialTest {
	
	@Test()
	public void SecondClass_method1() {
		System.out.println("Inside  SecondClass_method1");
		//Assert.fail();
	}
	
	
	  @Test() 
	  public void  SecondClass_method2() 
	  { 
		  System.out.println("Inside  SecondClass_method2"); 
		}
	  
	  
	  @Test() 
	  public void  SecondClass_method3() 
	  { 
		  System.out.println("Inside  SecondClass_method3"); 
		}
	 


}
