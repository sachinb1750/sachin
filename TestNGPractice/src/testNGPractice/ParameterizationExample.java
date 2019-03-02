package testNGPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	@Test
	@Parameters({"userName","password"})
	public void m1(String userName,String password){
		System.out.println("Username is: "+userName);
		System.out.println("Password is: "+password);
		
	}

}
