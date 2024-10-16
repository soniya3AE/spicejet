package com.mkt.source.Project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SingUpPage {
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement title;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement country;
	
	@FindBy(id="dobDate")
	WebElement DOB;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	WebElement month;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement year;
	@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--003 react-datepicker__day--keyboard-selected']")
	WebElement day;
	
	@FindBy(xpath="//div[@class='selected-flag']")
	WebElement countrycode;
	
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement mobilenumber;
	
    @FindBy(id="email_id")
    WebElement emailid;
    
    @FindBy(id="new-password")
    WebElement newpassword;
	
    @FindBy(id="c-password")
    WebElement confirmpassword;
    
    @FindBy(xpath="//input[@class='form-check-input mt-02']")
    WebElement checkbox;
    
    @FindBy(xpath="//button[@class='btn btn-red']")
    WebElement Login;
    
    @FindBy(xpath="//label[.=\"OTP Verification\"]")
    WebElement OTPpopup;
	
	public void select_title()
	{
		Select s1=new Select(title);
		s1.selectByVisibleText("Mr");
	}
	public void enter_firstname()
	{
		firstname.sendKeys("saroj");
	}
	public void enter_lastname()
	{
		lastname.sendKeys("kund");
	}
	public void select_country()
	{
		Select s1=new Select(country);
		s1.selectByValue("IN");
	}
	public void date_of_Birth()
	{
		DOB.click();
	}
	
	public void select_month()
	{
		Select s1=new Select(month);
		s1.selectByValue("6");
	}
	public void select_year()
	{
		Select s1=new Select(year);
		s1.selectByValue("1980");
	}
	public void select_day()
	{
		day.click();
	}
	
	public void select_countrycode()
	{
		countrycode.click();
	}
	
	public void mobile_number()
	{
		mobilenumber.sendKeys("8080656111");
	}
	public void enter_emailid(WebDriver driver) throws InterruptedException
	{
//		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
//		w1.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_id")));
		emailid.click();
		
		Thread.sleep(4000);
		
		Actions a1=new Actions(driver);
		a1.sendKeys(emailid, "saroj2323232@gmail.com").build().perform();
		//emailid.sendKeys("test@test.com");
	}
	public void enter_password(WebDriver driver) throws InterruptedException
	{
		
		Actions a1=new Actions(driver);
		Thread.sleep(4000);
		a1.click(newpassword).build().perform();
		//newpassword.click();
		
		Thread.sleep(4000);
		
		a1.sendKeys(newpassword, "Password1@").build().perform();
		//newpassword.sendKeys("Password1@");
	}
	public void confirm_password() throws InterruptedException
	{
		Thread.sleep(4000);
		confirmpassword.sendKeys("Password1@");
	}
	
	public void checkbox(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(4000);
        Actions a1=new Actions(driver);
        a1.click(checkbox).build().perform();	
//      checkbox.click();
	}
	
	public void click_sibmit(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.click(Login).build().perform();
		
	}
	
	public void  OTP_assertion()
	{
		//OTPpopup.getText();
		Assert.assertEquals(OTPpopup.getText(), "OTP Verification", "Registration unsuccessful");
	}
	
	
	
	
	public SingUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
