package com.mkt.source.Project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
	@FindBy (xpath="//*[@id=\"prepayment-container\"]/div[2]/div/div[1]/div/div/div[3]/div[2]/div/div[2]/div")
	WebElement Promocode;
	
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[14]")
	WebElement selectPromecode;
	
	@FindBy (xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-eu3ka r-1777fci r-156q2ks r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73 r-1f720gc']")
	WebElement clickapplay;
	
	@FindBy(xpath="//div[@data-testid='common-proceed-to-pay']")
	WebElement clickproceedtopay;
	
	@FindBy(xpath="//iframe[@class='card_number_iframe']")
	WebElement cardnumberiframe;	
	@FindBy(xpath="//iframe[@class='name_on_card_iframe']")
	WebElement cardholderiframe;
	
	@FindBy(xpath="//iframe[@class='card_exp_month_iframe']")
	WebElement cardmonthiframe;
	
	@FindBy(xpath="//iframe[@class='card_exp_year_iframe']")
	WebElement cardyeariframe;
	
	@FindBy(xpath="//iframe[@class='security_code_iframe']")
	WebElement cardcvviframe;
	
	
	@FindBy(xpath="//*[@id=\"card_number\"]")
	WebElement cardnumber;
	
	@FindBy(xpath="//*[@id=\"name_on_card\"]")
	WebElement cardholdername;
	
	@FindBy(xpath="//*[@id=\"card_exp_month\"]")
	WebElement cardmonth;
	
	@FindBy(xpath="//*[@id=\"card_exp_year\"]")
	WebElement cardyear;
	
	@FindBy(xpath="//*[@id=\\\"security_code\\\"]")
	WebElement cvvnumber;
	
	

	public void Enter_Card_details(WebDriver driver) throws InterruptedException
	{
		driver.switchTo().frame(cardnumberiframe);
		cardnumber.sendKeys("5234 5234 5234 5234 523");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(cardholderiframe);
		cardholdername.sendKeys("Saroj kund");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(cardmonthiframe);
		cardmonth.sendKeys("03");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(cardyeariframe);
		cardyear.sendKeys("28");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(cardyeariframe);
		cardyear.sendKeys("234");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}
	public void Click_Promo_code()
	{
		Promocode.click();
	}
	
	public void Select_Prome_Code()
	{
		selectPromecode.click();
	}
	
	public void Click_apply_button()
	{
		clickapplay.click();
	}
	
	public void Click_procced_to_pay(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);	
//		Actions a1=new Actions(driver);
//		a1.click(clickproceedtopay).build().perform();
		clickproceedtopay.click();
	}
		
	public Payment_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
