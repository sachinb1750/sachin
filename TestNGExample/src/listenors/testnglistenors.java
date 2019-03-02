package listenors;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testnglistenors implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("------------------Test Start--------------------");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("------------------Test Passed====================");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("------------------Test Failed********************"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("::::::::::::::::::::::::  Start ::::::::::::::::::::::::::::");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("::::::::::::::::::::::::  End   ::::::::::::::::::::::::::::");
	}
	//Take screenshot on every failure
	//ItestListenor interface which impliments TestNG Listenor
}
