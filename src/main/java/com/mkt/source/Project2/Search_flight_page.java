package com.mkt.source.Project2;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Search_flight_page {

	// static WebDriver driver;

	// step 1 : define the webElement using Find by annotation
	
	@FindBy(xpath="(//input[@autocapitalize='sentences'])[1]")
	WebElement  sourceAddress;
	
	@FindBy(xpath="(//input[@autocapitalize='sentences'])[2]")
	WebElement destinationAddress;
	
	@FindBy(xpath="(//a[@to='https://spiceclub.spicejet.com/signup'])[1]")
	WebElement singup;
	
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1loqt21 r-19bllq0 r-u8s1d r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']")
	WebElement backward_Month;
	
	@FindBy(xpath="//div[@class='r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-1i6wzkk r-lrvibr r-184en5c css-1dbjc4n']")
	WebElement forward_Month;
	
	@FindBy(xpath="//div[contains(text(),'Departure Date')")
	WebElement departureCalender;
	
	
	//Step 2
	
	public void enterFromAddress() {
		sourceAddress.sendKeys("Mumbai");	
		Assert.assertTrue(true);
		
	}
	
	public void enterToAddress() {
	//	destinationAddress.click();
		destinationAddress.clear();
		destinationAddress.sendKeys("BLR");
		Assert.assertTrue(true);
		destinationAddress.click();
		
	}
	
	
	
	public void clickToForwardMonth() {
		
		departureCalender.click();
		
		//forward_Month.click();
		//Assert.assertTrue(true);
		
	}
	
	
	
	
	
	
	
	
	
	// step3
	public Search_flight_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		

	}
}
