package testexercise;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng1 {
	//Using TestNG library to compile code which itself use Java Compiler at back end
	//But thats why we don't require main method as we are not running it as Java Application
	
//	@Test annotations need to be used to run Test Cases using TestNG
	@Test
	public void demo1() {
		System.out.println("Hello : I am in Demo : 1 Test Exercise Function");
	}
//	In single class we can define multiple test
	@Test
	public void demo3() {
		System.out.println("Hello : I am in Demo : 3 Test Exercise Function");
	}
	@Test(groups="regression")
	public void regression1() {
		System.out.println("Regression 1 : testexercise - testngbasic1");
	}
	@Parameters({"TC_2"})
	@Test(groups="regression")
	public void regression2(String tc_2) {
		System.out.println("Regression 2 : testexample - testngbasic1 : "+tc_2);
	}
	@Test(groups="regression")
	public void regression3() {
		System.out.println("Regression 3 : testexercise - testngbasic1");
		Assert.assertTrue(false);
	}
	
	@Test(groups="smoke")
	public void smoke2() {
		System.out.println("Smoke 2 : testexercise - testngbasic1");
		
	}
	@Test(groups="smoke")
	public void smoke1() {
		System.out.println("Smoke 1 : testexercise - testngbasic1");
	}
	@DataProvider
	public Object[][] getData() {
		System.out.println("Data Provider");
		//1st Combination - Intelligent
		//2nd Combination - Avarage
		//3rd Combination - Poor
		Object[][] data = new Object[3][2];
		
		data[0][0]="Intelligent : 1";
		data[0][1]="Intelligent : 2";
		
		data[1][0]="Average : 1";
		data[1][1]="Average : 2";
		
		data[2][0]="Poor : 1";
		data[2][1]="Poor : 2";
		
		return data;
	}
	@Test(dataProvider="getData",groups="regression")
	public void dataProviderTest(String grade1, String grade2) {
		System.out.println("Data Provider and Test");
		System.out.println(grade1+" "+grade2);
	}
}
