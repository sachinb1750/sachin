package testNGPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		
		//afterTest
		System.out.println("On Test Complete");
		
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		//beforeTest
		System.out.println("On Test Start");	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
				
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		
		System.out.println("On Test Fail");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("On Test Skip");	
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		
	}
	

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("On Test Success");
		
	}

}
