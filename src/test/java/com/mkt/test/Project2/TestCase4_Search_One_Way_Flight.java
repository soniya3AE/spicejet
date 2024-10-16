package com.mkt.test.Project2;

import org.testng.annotations.Test;

import com.mkt.source.Project2.Search_Flight_Page1;

import maven.SpiceJet.Login_Page;

public class TestCase4_Search_One_Way_Flight extends LunchQuit{
	
	@Test
	public void Search_for_One_Way_Flight() throws InterruptedException
	{
		Login_Page  logpage=new Login_Page(driver);
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
	}

}
