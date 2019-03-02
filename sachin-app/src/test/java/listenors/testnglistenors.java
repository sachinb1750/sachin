package listenors;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import suiteBase.Selenium;

public class testnglistenors extends Selenium implements ITestListener, IReporter {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed::::::::::::::::::::::::::");
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed in : " + result.getName());
			System.out.println(result.getStatus());
			System.out.println(Selenium.driver);
			File srcF = ((TakesScreenshot) Selenium.driver).getScreenshotAs((OutputType.FILE));
			String currDir = getCurrentDir();
			String propcurrDir = currDir.replace("\\", "\\\\");
			try {
				FileUtils.copyFile(srcF, new File(propcurrDir + "\\\\Output\\\\screenshot1.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("No Screenshot");
		}
		// TODO Auto-generated method stub

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub

	}

}
