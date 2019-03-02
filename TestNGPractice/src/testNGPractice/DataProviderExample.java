package testNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	//String[][] arr = new String[][]{{"test","test"}};
	
	@Test(dataProvider="Credentials")
	public void m1(String userName,String password){
		System.out.println("Username is : "+userName);
		System.out.println("Password is : "+password);
	}
	
	@DataProvider(name="Credentials")
	public Object[][] provideData(){
		return new Object[][]{{"testUser1","password1"},{"testUser2","password2"}};	
	}
	

}
