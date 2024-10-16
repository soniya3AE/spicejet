package com.mkt.test.Project2;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LunchQuit {
	WebDriver driver;
	 @BeforeMethod
	 public void lunch_browser()
	 {
		 	 
		 Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.spicejet.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					
	 }
	 @AfterMethod
	 public void quit()
	 {
		 
	 }

}
