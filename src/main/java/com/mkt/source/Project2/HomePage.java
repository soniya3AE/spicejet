package com.mkt.source.Project2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[3]/div[2]/div/a/div")
	WebElement signup;
	
	public void sign_up()
	{
		signup.click();
	}
	
	public void swtich_to_childwindow(WebDriver driver) throws InterruptedException
	{
	Set<String> allwindows=driver.getWindowHandles();
    Iterator<String> i	= allwindows.iterator();
	String parentwindow = i.next();
	String childwindow = i.next();
	driver.switchTo().window(childwindow);
	Thread.sleep(2000);
	}
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
