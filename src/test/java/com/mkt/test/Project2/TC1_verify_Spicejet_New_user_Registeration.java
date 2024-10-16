package com.mkt.test.Project2;



import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mkt.source.Project2.AirIndia_Login_page;
import com.mkt.source.Project2.Login_page;




@Listeners(ListernerProgram.class)
public class TC1_verify_Spicejet_New_user_Registeration   extends BaseLanchQuit{
	
	//WebDriver driver;
	
	@Test
	public void Verify_sucessfully_register() throws InterruptedException {
		
		Login_page l1 = new Login_page(driver);
		l1.click_on_singup(driver);
		l1.select_title();
		l1.select_dob(driver);
		l1.enter_user_name();
	
		l1.enter_user_last_name();
		l1.enter_user_email(driver);
		l1.select_nationality_from_drop_down();
		l1.enter_user_phone_number();
		l1.enter_user_password(driver);
		l1.enter_user_confirmation_password(driver);
		l1.user_confirm_terms(driver);
		l1.click_continue_button_to_submit_contact_details(driver);
		System.out.println("hello");
		
	 
	
	}
	
	

}
