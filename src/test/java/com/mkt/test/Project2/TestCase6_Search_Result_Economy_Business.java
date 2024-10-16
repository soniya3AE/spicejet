package com.mkt.test.Project2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.mkt.source.Project2.Search_Flight_Page1;

import maven.SpiceJet.Login_Page;

public class TestCase6_Search_Result_Economy_Business extends LunchQuit {
	@Test
	public void Search_Result_Economy_Business() throws InterruptedException
	{
		Login_Page logpage=new Login_Page(driver);
		logpage.login_link_click();
		Thread.sleep(4000);
		logpage.mobilenumber_select();
		logpage.enter_mobile_number();
		logpage.enter_password();
		logpage.click_login_button();
		Search_Flight_Page1 seaflight1=new Search_Flight_Page1(driver);
		Thread.sleep(4000);
		seaflight1.enter_flightsource(driver);
		seaflight1.enter_flightdestination(driver);
		Thread.sleep(2000);
		seaflight1.select_month_year_depature_date();
		seaflight1.click_passenger_dropdown();
		seaflight1.click_add_passenger();
		seaflight1.click_search_flight_button(driver);
		Links_SearchResult_Page searchpage=new Links_SearchResult_Page(driver);
		searchpage.click_continue_button();
		Thread.sleep(10000);
		driver.navigate().back();
		WebElement w1=driver.findElement(By.xpath("(//*[local-name()='svg'and @data-testid='svg-img']/*[local-name()='circle'])[4]"))	;	
		Actions a1=new Actions(driver);
		a1.click(w1).build().perform();
		searchpage.click_continue_button();
	}

}
