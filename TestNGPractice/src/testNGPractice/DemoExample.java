package testNGPractice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoExample {
	
	WebDriver driver;
	
	
	@Test
	public void loginToApplication() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
		Assert.fail();
	}
	
	@Test(dependsOnMethods= {"loginToApplication"})
	public void findFlights() {
		driver.findElement(By.name("findFlights")).click();
	}

}
