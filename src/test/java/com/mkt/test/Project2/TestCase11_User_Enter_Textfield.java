package com.mkt.test.Project2;

import org.testng.annotations.Test;

import com.mkt.source.Project2.Search_Flight_Page1;

import maven.SpiceJet.Passenger_details_Page;

public class TestCase11_User_Enter_Textfield extends LunchQuit{
	
	@Test
	public void User_able_to_Enter_value_EachFields() throws InterruptedException
	{
	
	Search_Flight_Page1 seaflight1=new Search_Flight_Page1(driver);
	Thread.sleep(4000);
	seaflight1.enter_flightsource(driver);
	seaflight1.enter_flightdestination(driver);
	Thread.sleep(2000);
	seaflight1.select_month_year_depature_date();
	seaflight1.click_passenger_dropdown();
	seaflight1.click_add_passenger();
	seaflight1.click_search_flight_button(driver);
	Links_SearchResult_Page searchres=new Links_SearchResult_Page(driver);
	searchres.click_continue_button();
	Passenger_details_Page passdetails=new Passenger_details_Page(driver);
	passdetails.select_title();
	passdetails.enter_firstname();
	passdetails.enter_lastname();
	passdetails.enter_phonenumber();
	passdetails.enter_emailid();
	Thread.sleep(4000);
	passdetails.enter_towncity(driver);
	
	
	}

}
