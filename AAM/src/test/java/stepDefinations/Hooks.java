package stepDefinations;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.aventstack.extentreports.ExtentTest;

import assessment_AltoroMutual_Utils.BaseClass;
import assessment_AltoroMutual_Utils.Constants;
import assessment_AltoroMutual_Utils.TestUtilities;
import cucumber.api.java.After;
import cucumber.api.java.Before;
public class Hooks {
	BaseClass baseClassObj = new BaseClass();
	static ExtentTest test;

	@Before
	public void beforeCucumber() {
		baseClassObj.setUpResources();
		baseClassObj.startClass();
		test = BaseClass.classLevelReport.get().createNode("Cucumber");
//		test.assignCategory("Test_Level_Report");
//		BaseClass.testLevelReport.set(test);
		//Instantiates loggers at test level
		BaseClass.logger = Logger.getLogger("Cucumber");
		PropertyConfigurator.configure(Constants.getLoggerPath());
		System.out.println("Cucumber API Before");
		
	}
	@After
	public void afterCucumber() {
		System.out.println("Cucumber API After");
//		BaseClass.extent.flush();
		baseClassObj.killClass();
		TestUtilities.archiveJsonReports();
		TestUtilities.archiveExtentReports();
		TestUtilities.archiveTestNgReports();
	}
}
