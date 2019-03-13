/**
 * ClassName :- Constants
 * @author sacbhard 
 */

package assessment_AltoroMutual_Utils;

public class Constants {
	
	private static final String CHROME_PATH = System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";
	private static final String IE_PATH=System.getProperty("user.dir")+"/src/test/resources/executables/IEDriver.exe";
	private static final String FIREFOX_PATH=System.getProperty("user.dir")+"/src/test/resources/executables/geckodriver.exe";
	
	private static final String CHROME_PATH_MAC=System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver";
	private static final String FIREFOX_PATH_MAC=System.getProperty("user.dir")+"/src/test/resources/executables/geckodriver";
	
	private static final String LOGGER_PATH = System.getProperty("user.dir") + "/src/test/resources/propertyFiles/log4j.properties";
	private static final String CONFIG_PATH = System.getProperty("user.dir")+"/src/test/resources/propertyFiles/config.properties";
	private static final String EXTENT_CONFIG_PATH =System.getProperty("user.dir")+"/src/test/resources/extentConfig/ReportsConfig.xml";
	
	private static final String SCREENSHOT_PATH="./testResults/extentReports/screenshots/";
	
	private static final String ARCHIVED_SCREENSHOT_PATH="./testResults/screenshotArchived/";
	
	private static final String TESTNG_PATH="./test-output/";
	private static final String ARCHIVED_TESTNG_PATH="./testResults/testngreportsArchived/";
	
	private static final String EXTENTREPORT_PATH="./testResults/extentReports/";
	private static final String ARCHIVED_EXTENTREPORT_PATH="./testResults/extentreportsArchived/";
	
	private static final String ARCHIVED_CUCUMBER_PATH="./testResults/cucumberreportsArchived/";
	
	private static final String RUNNER_JSON_PATH="./src/test/resources/jsonFiles/Runner.json";
	private static final String TEST_RUN_CONFIG_PATH="./src/test/resources/jsonFiles/testRunConfigurations.json";
	
	private static final String JENKINS_REPORTS_PATH = "./testResults/";
	
	private static final String JSON_PATH = "./testResults/";
	private static final String ARCHIVED_JSON_PATH = "./testResults/jsonreportsArchived/";
	
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
		return CONFIG_PATH;
	}
	
	public static String getLoggerPath() {
		return LOGGER_PATH;
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
	public static String getTestRunnerConfigPath() {
		return TEST_RUN_CONFIG_PATH;
	}
	public static String getArchived_TestNgPath() {
		return ARCHIVED_TESTNG_PATH;
	}
	public static String getTestNgPath() {
		return TESTNG_PATH;
	}
	public static String getArchived_CucumberPath() {
		return ARCHIVED_CUCUMBER_PATH;
	}
	public static String getArchived_ExtentReportPath() {
		return ARCHIVED_EXTENTREPORT_PATH;
	}
	
	public static String getExtentReportsPath() {
		return EXTENTREPORT_PATH;
	}

	public static String getJenkinsReportsPath() {
		return JENKINS_REPORTS_PATH;
	}

	public static String getJsonReportPath() {
		return JSON_PATH;
	}

	public static String getArchivedJsonPath() {
		return ARCHIVED_JSON_PATH;
	}

}
