package com.mkt.source.Project2;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Login_page {

	// static WebDriver driver;

	// step 1 : define the webElement using Find by annotation
	@FindBy(xpath="(//a[@to='https://spiceclub.spicejet.com/signup'])[1]")
	WebElement singup;
	

	
	@FindBy(xpath="	//select[@class='form-control form-select ']")
	WebElement select_title;
	
	@FindBy(id ="first_name")
	WebElement first_name;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement last_name;
	
	@FindBy(xpath="(//div[@class='col-sm-6 mt-30 px-sm-4'])[3]//select[@class='form-control form-select']")
	WebElement  select_nation_dropdown;
	
	@FindBy(id="new-password")
	WebElement password;
	
	@FindBy(id="c-password")
	WebElement confirm_password;
	
	@FindBy(xpath="//input[@id='email_id']")
	WebElement enter_email;
	
	@FindBy(xpath ="//input[@type='tel']")
	WebElement phone_number;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement submit_button;
	
	@FindBy(id="defaultCheck1")
	WebElement checkmark_terms;
	
	@FindBy(id="dobDate")
	WebElement dob;
	
	
	
	
			
	
	//step2 
	public void click_on_singup(WebDriver driver) {
	singup.click();
	String 	parentid = driver.getWindowHandle();
	System.out.println("parent id :"+ parentid);
	
	Set<String> childid = driver.getWindowHandles();
	System.out.println("Child id : "+ childid);
	
	Iterator<String> l1 = childid.iterator();
	String pparentid = l1.next();
	String pandchildid = l1.next();	   
	driver.switchTo().window(pandchildid);  
	}
	
	
	public void select_title(){
		select_title.click();
		Select s1 = new Select(select_title);
		s1.selectByValue("Mrs");
		Assert.assertTrue(true);
		Reporter.log("user entered title");
	}
	
	
	public void enter_user_name() {
		first_name.sendKeys("soniya");
		Assert.assertTrue(true);
		Reporter.log("entered user name");

	}

	public void enter_user_last_name() throws InterruptedException {
		Thread.sleep(3000);
		last_name.sendKeys("KT");
		Assert.assertTrue(true);
		Reporter.log("user last name entered");

	}
	

	public void select_nationality_from_drop_down() throws InterruptedException {
		Thread.sleep(3000);
		Select s1 = new Select(select_nation_dropdown);
		s1.selectByValue("IN");
		Assert.assertTrue(true);
		Reporter.log("selected india");
	}
	
	public void enter_user_phone_number() {
		phone_number.sendKeys("7406501839");
		phone_number.sendKeys(Keys.ENTER);
		Assert.assertTrue(true);
		Reporter.log("user phone number  is entered");

	}
	
	public void select_dob(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dobDate"))).click();
		dob.sendKeys("06/07/1995");
		dob.sendKeys(Keys.ENTER);
		Assert.assertTrue(true);
		Reporter.log("Selected date of birth");
	}
	
	public void enter_user_email(WebDriver driver) throws InterruptedException {  
		Thread.sleep(3000);
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		j1.executeScript("arguments[0];", enter_email);

		enter_email.sendKeys("soniyakamble27@gmail.com");
		Assert.assertTrue(true);
		Reporter.log("user email is entered");

		
	}
	
	
	public void enter_user_password(WebDriver driver) throws InterruptedException {
		//Thread.sleep(3000);
		JavascriptExecutor j2 = (JavascriptExecutor) driver;
		j2.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("new-password"))).click();
		password.sendKeys("Abhi@123");
		password.sendKeys(Keys.ENTER);
		Assert.assertTrue(true);
		Reporter.log("user password  is entered");

	}
	
	public void enter_user_confirmation_password(WebDriver driver ) throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		confirm_password.sendKeys("Abhi@123");
		Assert.assertTrue(true);
		Reporter.log("user confirmation password  is entered");

	}
	
	
	public void user_confirm_terms(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView();", checkmark_terms);
		checkmark_terms.click();
		Assert.assertTrue(true);
		Reporter.log("checkmarked  terms");

	}
	public void click_continue_button_to_submit_contact_details(WebDriver driver) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	      submit_button.isEnabled();
		submit_button.click();
		Assert.assertTrue(true);
		Reporter.log("clicked on submit button");

	}
	

	// step3
	public Login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
}
