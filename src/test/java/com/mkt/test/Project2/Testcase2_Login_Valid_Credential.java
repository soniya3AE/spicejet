package com.mkt.test.Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mkt.source.Project2.Logout_Page;

import maven.SpiceJet.Login_Page;

public class Testcase2_Login_Valid_Credential extends LunchQuit {
	@Test
	public void Login_valid_credential() throws InterruptedException
	{
		Login_Page logpage=new Login_Page(driver);
		//checking whether user able to login with mobile number
		logpage.login_link_click();
		Thread.sleep(4000);
		logpage.mobilenumber_select();
		logpage.enter_mobile_number();
		logpage.enter_password();
		logpage.click_login_button();
		
		Thread.sleep(4000);
		Logout_Page logpag=new Logout_Page(driver);
		//Thread.sleep(4000);
		logpag.click_svg_img(driver);
		Thread.sleep(2000);
		logpag.click_logout(driver);
		Thread.sleep(4000);
		logpage.login_link_click();
		Thread.sleep(4000);
		//checking whether user able to login with gmail id
		logpage.email_select();
		logpage.enter_emailid();
		logpage.enter_password();
		logpage.click_login_button();
		logpage.assertion_after_valid_login();
		
		
		
	}

}
