package org.demo.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.annotations.AfterTest;

public class MercurySelectFlightPage {
	WebDriver driver;
	
	By lbl_HeaderMsg = (By.xpath("//td/font[contains(text(),'Select your departure')]"));
	By lbl_Headers = (By.cssSelector("table:nth-of-type(1) td[class='frame_header_info'][bgcolor='#003399']"));
	
	By btn_Continue = (By.cssSelector("input[name='reserveFlights']"));
	
	public MercurySelectFlightPage(WebDriver driver){
		
		this.driver = driver;	
	}	
	
	public void validateMercurySelectFlightPage(){
		
		if(driver.getTitle().contains("Select a Flight: Mercury Tours"))
		{
			System.out.println("Landed to Expected Page: " + driver.getTitle());			
		}
		else
		{
			System.out.println("Landed to Incorrect Page: " + driver.getTitle());			
		}
	}

	public void verifyFlightPage(){			
			if(driver.findElement(lbl_HeaderMsg)!= null){
					System.out.println("User is on Select Flight page ");
			}
	}	
	public void validateHeaderColorBlue(){
		
		List<WebElement> tblHeader= driver.findElements(lbl_Headers);
		if (tblHeader.size() > 0)
		{
			System.out.println("Header color is Blue");
		}
		else
		{
			System.out.println("Header color is not Blue");
		};
	}
	
	public MercuryBookFlightPage clickContinue(){
		driver.findElement(btn_Continue).click();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new MercuryBookFlightPage(driver);
	}
	
		
}
