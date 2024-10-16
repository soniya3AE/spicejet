package com.mkt.test.Project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseLanchQuit extends  ListernerProgram{
	
	
	//WebDriver driver;
	@BeforeMethod
	//@Parameters("browser")
	//@Test
	public void launchBrowser(  ) {		
	   			
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("--disable-notifications");
	    driver = new ChromeDriver(option);
		//driver.get("https://www.airindia.com/");
		driver.get("https://www.spicejet.com/");
		//driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();		
	}
	
	
	
	
	
	@AfterMethod
	public void closeBrowser() {
		//driver.close();
		
	}

}
