package org.demo.selenium.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class MercuryBookFlightPage {
	WebDriver driver;
	
	By btn_Continue = (By.xpath("//td/font[contains(text(),'Select your departure')]"));
	
	
	public MercuryBookFlightPage(WebDriver driver){
		
		this.driver = driver;	
	}	
	
	public void validateMercuryBookFlightPage(){
		
		if(driver.getTitle().contains("Book a Flight: Mercury Tours"))
		{
			System.out.println("Landed to Expected Page: " + driver.getTitle());			
		}
		else
		{
			System.out.println("Landed to Incorrect Page: " + driver.getTitle());			
		}
	}


	
}
