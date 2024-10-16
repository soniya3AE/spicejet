package com.mkt.source.Project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Search_Flight_Page1 
{
	@FindBy(xpath="(//*[name()='circle'])[3]")
	WebElement selectroundtripcircle;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement source_textbox;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement destination_textbox;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-16ru68a r-y47klf r-1loqt21 r-eu3ka r-1otgn73 r-1aockid']")
	WebElement departuredate;
	
	@FindBy(xpath="//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")
	WebElement returndate;
	
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[2]")
	WebElement selectmonthyear;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[31]")
	WebElement selectdatedeparture;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-1loqt21 r-eu3ka r-1otgn73 r-1aockid'])[36]")
	
	WebElement selectdatereturn;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")
	WebElement clickpassenger;
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[17]")
	WebElement clickpassengerroundtrip;
	
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[20]")
	WebElement clickaddadult;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement clickdone;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement clicksearchflightbutton;
	
	
	public void select_round_trip_circle()
	{
		selectroundtripcircle.click();
	}
	
	public void enter_flightsource(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(source_textbox));
		Actions a1=new Actions(driver);
		a1.sendKeys(source_textbox,"mum").build().perform();
		//from_textbox.sendKeys("mumbai");
    }
	
	public void enter_flightdestination(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.sendKeys(destination_textbox,"kol").build().perform();
		//from_textbox.sendKeys("mumbai");
    }
	
	public void click_departure_date()
	{
		departuredate.click();
	}
	public void select_date()
	{
		selectdatereturn.click();
	}
	public void select_month_year_depature_date()
	{
//		String str=selectmonthyear.getText();
//		//System.out.println(str);
//		if(str.equals("June 2024"))
//		{
			selectdatedeparture.click();
//		}
	}
	
	public void select_month_year_return_date()
	{
//		String str=selectmonthyear.getText();
//		//System.out.println(str);
//		if(str.equals("June 2024"))
//		{
			selectdatereturn.click();
//		}
	}
	
	public void click_passenger_dropdown()
	{
		clickpassenger.click();
	}
	public void click_passenger_dropdown_round_trip()
	{
		clickpassengerroundtrip.click();
	}
	
	public void click_add_passenger() throws InterruptedException
	{
		for (int i=0;i<=1;i++)
		  {
			clickaddadult.click();
			Thread.sleep(4000);
		  }
		
		clickdone.click();
    
	}
	
	public void click_search_flight_button(WebDriver driver)
	{
		clicksearchflightbutton.click();
		WebElement d=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-ymp9ed r-1j3t67a r-1w50u8q r-ah5dr5 r-1otgn73 r-1n20pny']"));
		//String modifytext=d.getText();
		Assert.assertEquals(d.getText(), "Modify Search", "Search is unccessful");
	}
	
	
	public Search_Flight_Page1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
