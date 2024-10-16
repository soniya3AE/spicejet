package com.mkt.source.Project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
	@FindBy(xpath="(//*[local-name()='svg' and @data-testid='svg-img' ]/*[local-name()='g']/*[local-name()='path'])[3]")
	WebElement svg_img;
	
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[1]")
	WebElement svg_img_search_logout;
	
	
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj'])[1]")
	WebElement logout;
	
	public void click_svg_img(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(4000);
		Actions a1=new Actions(driver);
		a1.click(svg_img).build().perform();
		//Thread.sleep(4000);
		//svg_img.click();
	}
	public void click_svg_img_search_logout(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(4000);
		Actions a1=new Actions(driver);
		a1.click(svg_img_search_logout).build().perform();
		//Thread.sleep(4000);
		//svg_img.click();
	}
	
	
	public void click_logout(WebDriver driver)
	{
		Actions a2=new Actions(driver);
		a2.click(logout).build().perform();
		//logout.click();
	}
	
public Logout_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
