package com.mkt.test.Project2;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mkt.source.Project2.AirIndia_Login_page;


@Listeners(ListernerProgram.class)
 public class TestCase2_Verify_Login_sucessfully_with_correct_email_Pass  extends  BaseLanchQuit {
	
	// ChromeDriver  driver;
	
	@Test
	public void Login_sucesfully_with_correct_email_Password() throws InterruptedException {
	
	    AirIndia_Login_page l1 = new AirIndia_Login_page(driver); 
	    l1.we_use_cookie();
		l1.click_on_signin();
	    l1.enter_email_to_login();
		l1.enter_password_to_login();
		l1.click_on_singin_to_login();
		l1.verify_user_name_displayed_on_home_page_after_login(driver);
	}

}
