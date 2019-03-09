
/**
 * ClassName :- DriverManager
 * @author sacbhard
 */

package assessment_AltoroMutual_Utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void setDriver(WebDriver dvr) {
		driver.set(dvr);
	}

	public static WebDriver getDriverInstance(String browser, int timePageLoad, int timeImplicitWait) {

		if (driver.get() == null) {
			if (browser.equalsIgnoreCase("FIREFOX")) {
				System.setProperty("webdriver.gecko.driver", Constants.getFirefoxPath());
				setDriver(new FirefoxDriver());
			}

			else if (browser.equalsIgnoreCase("CHROME")) {
				System.setProperty("webdriver.chrome.driver", Constants.getChromePath());
				setDriver(new ChromeDriver());
			}

			else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", Constants.getIEPath());
				setDriver(new InternetExplorerDriver());
			}

			else {
				System.out.println("Please Select a valid browser");
			}
		}

//		EventFiringWebDriver edriver = new EventFiringWebDriver(driver.get());
//		CustomListeners listen = new CustomListeners();
//		edriver.register(listen);
		setDriver(driver.get());
		maximizeBrowser(browser);
		setPageLoadTimeOut(timePageLoad);
		setImplicitWait(timeImplicitWait);
		return getDriver();
	}

	private static void setPageLoadTimeOut(int timePageLoad) {
		// TODO Auto-generated method stub
		
	}

	public static void killDriverInstance() {
		if (driver.get() != null) {
			driver.get().quit();
			driver.set(null);
		}
	}

	public static void maximizeBrowser(String browser) {
		if (!browser.equals("headless"))
			driver.get().manage().window().maximize();

	}

	public static void setImplicitWait(int time) {
		driver.get().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public static void setPageLoadTimeout(int time) {
		driver.get().manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
	}
}
