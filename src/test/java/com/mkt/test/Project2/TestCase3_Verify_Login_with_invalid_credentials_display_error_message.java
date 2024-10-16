package com.mkt.test.Project2;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mkt.source.Project2.AirIndia_Login_page;


@Listeners(ListernerProgram.class)
 public class TestCase3_Verify_Login_with_invalid_credentials_display_error_message  extends  BaseLanchQuit {
	
	// ChromeDriver  driver;
	
	@Test
	public void Login_sucesfully_with_incorrect_Password() throws InterruptedException {
	
	    AirIndia_Login_page l1 = new AirIndia_Login_page(driver); 
	    l1.we_use_cookie();
		l1.click_on_signin();
	    l1.enter_email_to_login();
		l1.enter_incorrect_password_to_login();
		l1.click_on_singin_to_login();
		l1.incorrect_password_warning_message();
		
	}

}
