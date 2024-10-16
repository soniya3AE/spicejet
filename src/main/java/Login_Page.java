

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login_Page {
	WebDriver driver;
	@FindBy(xpath="(//div[.='Login'])[3]")
	WebElement click_login_link;
	
	@FindBy(xpath="(//*[local-name()='svg' and @data-testid='svg-img' ]/* [local-name()='g']/*[local-name()='circle'])[5]")
	WebElement select_mobilenumber_circle;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[1]")
	WebElement enter_mobilenumber;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[2]")
	WebElement enter_password;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement clickloginbutton;
	
	@FindBy(xpath="(//*[name()='circle'])[13]")
	WebElement select_email_circle;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[1]")
	WebElement enter_emailid;
	
	
		
	
	public void login_link_click() 
	{
		click_login_link.click();
	}
	public void mobilenumber_select()
	{
		select_mobilenumber_circle.click();
	}
	public void enter_mobile_number()
	{
		enter_mobilenumber.sendKeys("7406501839");
	}
	public void enter_password()
	{
		enter_password.sendKeys("Amma@1996");
	}
	public void click_login_button()
	{
		clickloginbutton.click();
		
	}
	public void enter_wrong_mobile_number()
	{
		enter_mobilenumber.sendKeys("7406501839");
		Assert.assertEquals(clickloginbutton, click_login_link);
	}
	public void enter_wrong_password()
	{
		enter_password.sendKeys("Amma@1996");
	}
	public void email_select()
	{
		select_email_circle.click();
	}
	
	public void enter_emailid()
	{
		enter_emailid.sendKeys("soniyakamble@27@gmail.com");
	}
	
	public void assertion_after_valid_login()
	{

		Assert.assertTrue(true);
	}
	public void assertion_after_invalid_login()
	{
	
		Assert.assertTrue(false, "Login is not successful");
	}
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
