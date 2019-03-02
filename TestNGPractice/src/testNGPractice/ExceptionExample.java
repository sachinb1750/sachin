package testNGPractice;

import org.testng.annotations.Test;

public class ExceptionExample {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void m1(){
		int i=10/0;
		//Program terminates here and test will be passed
		System.out.println("Exception Test Example");
		
		
	}

}
