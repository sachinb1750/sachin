package suiteBase;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium extends BaseClass{
	protected static WebDriver driver;
	protected static JavascriptExecutor js;
	// Maven uses algorithm to detect all test which are having Test keyword
	// concatenated

	@BeforeTest(groups = "BrowserAutomation")
	public void BrowserAutomation() {
		System.out.println("BrowserAutomation");
	}

	@Test(groups = "Selenium")
	public void launchURL() {
		try {
			String url = getValuePropFile("urldemo1");
			driver.navigate().to(url);
			System.out.println(url);
//			SoftAssert sa = new SoftAssert();
//			Assert.assertEquals(true, false);
//			Assert.assertEquals(false, false);
//			Assert.assertTrue(false);
//			Assert.assertFalse(true);
//			Assert.assertTrue(true);
//			sa.assertAll();
		} catch (Exception e) {
			System.out.println("Error while launching the URL");
			e.printStackTrace();
		}
	}
	@Test(groups="Selenium",dependsOnMethods="launchURL",enabled=false)
	public void alertExample() {
		try {
			WebElement jsAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
			WebElement jsConfirmButton = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
			WebElement jsPromptButton = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
			WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
			jsAlertButton.click();
			driver.switchTo().alert().accept();
			System.out.println(resultText.getText());
			jsConfirmButton.click();
			driver.switchTo().alert().accept();
			System.out.println(resultText.getText());
			jsPromptButton.click();
			driver.switchTo().alert().sendKeys("Sachin");
			driver.switchTo().alert().accept();
			System.out.println(resultText.getText());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(groups="Selenium",dependsOnMethods="launchURL")
	public void webTable() {
		try {
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
			js = (JavascriptExecutor)driver;
			
			
			//js.executeScript("arguments[0].scrollIntoView(true);", rows);
			Thread.sleep(3000);
			for(WebElement row:rows) {
				int i=1;
				if(i<1) {
					continue;//skipping first iterations
				}
				List<WebElement> cols = row.findElements(By.xpath(".//td"));
				for(WebElement col:cols) {
					if(col.getText().contains("Python")) {
						 
						System.out.println(col.getText());
						//Assert.fail(col.getText());
					}
				}
				i=i++;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(groups="Selenium",enabled=false)
	public void syncLogin() {
		try {
		WebElement loginElement = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		loginElement.click();
		WebElement syncEmail;
		WebDriverWait waitLogin = new WebDriverWait(driver,60);
		syncEmail = waitLogin.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='user_email']")));
		syncEmail.sendKeys("abc@abc.com");
		Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(groups = "Selenium",enabled=false)
	public void mouseHoverExample() throws InterruptedException {
		//System.out.println("In ModuleSeleniumLEARNTest");
		WebElement mouseHover = driver.findElement(By.xpath("//button[@id='mousehover']"));
		Actions action = new Actions(driver);
		action.moveToElement(mouseHover).build().perform();
		System.out.println("Moved to element :" + mouseHover.getText());
		Thread.sleep(2000);
		WebElement topMouseHover = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//..//a[text()='Reload']"));
		topMouseHover.click();
		System.out.println("Clicked on element : " + topMouseHover.getText());
	}
	@Test(groups = "Selenium",enabled=false)
	public void windowHandle() throws InterruptedException {
		//System.out.println("In ModuleSeleniumLEARNTest");
		try {
		System.out.println("Handling Windows");
		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		System.out.println("In Parent Window");
		clickHere.click();
		System.out.println("Child Window Opened with Element"+ clickHere.getText());
		String s1=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		s.remove(s1);
		System.out.println(s1.toString());
		System.out.println("Switching to Child Window");
		driver.switchTo().window(s.iterator().next());
		WebElement childWindowElement = driver.findElement(By.xpath("//h3[text()='New Window']"));
		System.out.println(childWindowElement.getText());
		String s2 = driver.getWindowHandle();
		driver.close();
		driver.switchTo().window(s1);
		System.out.println(clickHere.getText());
		System.out.println("Switched to Parent Window");
		Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println("Exception occured while switching Windows");
			e.printStackTrace();
		}
	}
	@BeforeTest(groups = "elementsUi")
	public void elementsUi() {
		System.out.println("elementsUi");
	}

	@BeforeGroups(groups = "Selenium")
	public void launchBrowser() throws IOException {
		String browser = getValuePropFile("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			String chromecurrDir = getCurrentDir();
			chromecurrDir = chromecurrDir.replace("\\", "\\\\");
			chromecurrDir = chromecurrDir + "\\\\resources\\\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromecurrDir);
			try {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			String iecurrDir = getCurrentDir();
			iecurrDir = iecurrDir.replace("\\", "\\\\");
			iecurrDir = iecurrDir + "\\\\resources\\\\IEDriverServer";
			System.setProperty("webdriver.ie.driver", iecurrDir);
			try {
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@AfterGroups(groups="Selenium")
	public void closeBrowser() {
		driver.quit();
	}
}
