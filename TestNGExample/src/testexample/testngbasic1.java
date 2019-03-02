package testexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngbasic1 {
	//Using TestNG library to compile code which itself use Java Compiler at back end
	//But thats why we don't require main method as we are not running it as Java Application
	
//	@Test annotations need to be used to run Test Cases using TestNG
	@Test
	public void demo1() {
		System.out.println("Hello : I am in Demo : 1 Test Example Function");
	}
//	In single class we can define multiple test
	@Test
	public void demo3() {
		System.out.println("Hello : I am in Demo : 3 Test Example Function : Excluded");
	}
	@Test(groups="regression", parameters={"TC_1","Regression_TCs"})
	public void regression1(String tc_1, String regression_TCs) {
		System.out.println(regression_TCs);
		System.out.println("Regression 1 : testexample - testngbasic1 : "+tc_1);
	}
	@Parameters({"TC_2"})
	@Test(groups="regression")
	public void regression2(String tc_2) {
		System.out.println("Regression 2 : testexample - testngbasic1 : "+tc_2);
	}
	@Test(groups="regression")
	public void regression3() {
		System.out.println("Regression 3 : testexample - testngbasic1");
	}
	@Test(groups="smoke")
	public void smoke1() {
		System.out.println("Smoke 1 : testexample - testngbasic1");
	}
	@Test(groups="smoke")
	public void smoke2() {
		System.out.println("Smoke 2 : testexample - testngbasic1");
	}
	@Test(groups="regression")
	public void globalData() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\democodeexercise\\TestNGExample\\datadriven.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("fname"));
		System.out.println(prop.getProperty("lname"));
		
	}
}
