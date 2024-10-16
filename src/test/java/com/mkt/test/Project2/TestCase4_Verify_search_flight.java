package com.mkt.test.Project2;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mkt.source.Project2.AirIndia_Login_page;
import com.mkt.source.Project2.Login_page;
import com.mkt.source.Project2.Search_flight_page;


@Listeners(ListernerProgram.class)
 public class TestCase4_Verify_search_flight  extends  BaseLanchQuit {
	

	@Test
	public void search_flight() throws InterruptedException {
	
	
		Search_flight_page s1 = new Search_flight_page(driver);
		s1.enterFromAddress();
		s1.enterToAddress();
	//	s1.clickToForwardMonth();
	//	s1.clickToForwardMonth();
		
		

	}

}
