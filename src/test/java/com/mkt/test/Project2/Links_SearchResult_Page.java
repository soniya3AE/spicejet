package com.mkt.test.Project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;

public class Links_SearchResult_Page {
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-1xedbs3 r-n6v787 r-16dba41 r-7o8qx1 r-156q2ks'])[1]")
	WebElement flightdetailslink;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-16dba41'])[1]")
	WebElement flightinfoscroll;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-16dba41'])[2]")
	WebElement baggagelink;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-16dba41'])[3]")
	WebElement cancellation;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement clickcontinuebutton;
	
	public void click_Flight_Details_link(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(flightdetailslink));
		Actions a1=new Actions(driver);
		a1.click(flightdetailslink).build().perform();
		flightdetailslink.click();
	}
	
	public void scroll_flightinfo(WebDriver driver)
	{
		Point p1=flightinfoscroll.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		JavascriptExecutor javexe= (JavascriptExecutor) driver; 
		javexe.executeScript("window.scrollBy(0,"+y+")");
	}
	
	public void click_baggagelink()
	{
		baggagelink.click();
	}
	
	public void click_cancellationlink()
	{
		cancellation.click();
	}
	
	public void click_continue_button()
	{
		clickcontinuebutton.click();
	}
	
	public Links_SearchResult_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
