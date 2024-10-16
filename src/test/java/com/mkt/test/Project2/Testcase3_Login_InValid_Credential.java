package com.mkt.test.Project2;

import org.testng.annotations.Test;

import maven.SpiceJet.Login_Page;

public class Testcase3_Login_InValid_Credential extends LunchQuit{
	//WebDriver driver;
	@Test
	
	public void Login_Invalid_credential()
	{
		Login_Page logpage=new Login_Page(driver);
		logpage.login_link_click();
		logpage.mobilenumber_select();
		logpage.enter_wrong_mobile_number();
		logpage.enter_password();
		logpage.click_login_button();
		
	}

}
