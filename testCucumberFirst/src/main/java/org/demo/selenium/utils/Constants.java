/**
 * ClassName :- Constants
 * This class declares and initializes a set of contants used throughout the project
 * 
 * Created By 	:- Umesh Joshi/Viral Singh
 * Created Date :- 17-Nov 2018
 * Modified By 	:- 
 * Modified Date:- 
 */

package org.demo.selenium.utils;

public class Constants {
	
	private static final String CHROME_PATH = System.getProperty("user.dir")+"/resources/executables/chromedriver.exe";
	private static final String IE_PATH=System.getProperty("user.dir")+"/resources/executables/IEDriver.exe";
	private static final String FIREFOX_PATH=System.getProperty("user.dir")+"/resources/executables/geckodriver.exe";
	private static final String CHROME_PATH_MAC=System.getProperty("user.dir")+"/resources/executables/chromedriver";
	private static final String FIREFOX_PATH_MAC=System.getProperty("user.dir")+"/resources/executables/geckodriver";
	private static final String CONFIG = System.getProperty("user.dir")+"/resources/propertyFiles/config.properties";
	private static final String EXTENT_CONFIG_PATH =System.getProperty("user.dir")+"/resources/extentConfig/ReportsConfig.xml";
	private static final String SCREENSHOT_PATH="./testResults/extentReports/screenshots/";
	private static final String ARCHIVED_SCREENSHOT_PATH="./testResults/screenshotArchived/";
	private static final String RUNNER_JSON_PATH="./resources/jsonFiles/Runner.json";
	private static final String TEST_RUN_CONFIG_PATH="./resources/jsonFiles/testRunConfigurations.json";
	private static final String EXTENTREPORT_PATH="./testResults/extentReports/";
	private static final String ARCHIVED_EXTENTREPORT_PATH="./testResults/extentreportsArchived/";
	
	public static String getChromePath() {
		return CHROME_PATH;
	}
	
	public static String getFirefoxPath() {
		return FIREFOX_PATH;
	}
	
	public static String getIEPath() {
		return IE_PATH;
	}
	
	public static String getChromePathMac() {
		return CHROME_PATH_MAC;
	}
	
	public static String getFirefoxPathMac() {
		return FIREFOX_PATH_MAC;
	}
	
	public static String getConfigPath() {
		return CONFIG;
	}
	
	public static  String getExtentConfigPath() {
		return EXTENT_CONFIG_PATH;
	}
	
	public static  String getScreenshotPath() {
		return SCREENSHOT_PATH;
	}
	
	public static  String getArchivedScreenshotPath() {
		return ARCHIVED_SCREENSHOT_PATH;
	}
	public static String getRunnerJsonPath() {
		return RUNNER_JSON_PATH;
	}
	public static String geTestRunnerConfigPath() {
		return TEST_RUN_CONFIG_PATH;
	}
	public static String getArchived_ExtentReportPath() {
		return ARCHIVED_EXTENTREPORT_PATH;
	}
	
	public static String getExtentReportsPath() {
		return EXTENTREPORT_PATH;
	}

}
