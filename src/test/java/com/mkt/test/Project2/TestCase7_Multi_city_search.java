package com.mkt.test.Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase7_Multi_city_search {
	@Test
	public void Mulit_city_search() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airindia.com/");
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c64-1']")).click();
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]")).click();
		driver.findElement(By.xpath("//input[@id='From'][1]")).sendKeys("mum");
		driver.findElement(By.xpath("//div[@class='row airport-country-detail']")).click();
		driver.findElement(By.xpath("(//input[@id='To'])[1]")).sendKeys("kol");
		driver.findElement(By.xpath("//div[@class='row airport-country-detail']")).click();
		driver.findElement(By.xpath("(//input[@id='datepickerlone'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='btn-light ng-star-inserted'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='To'])[2]")).sendKeys("bhu");
		driver.findElement(By.xpath("//div[@class='row airport-country-detail']")).click();
		driver.findElement(By.xpath("(//input[@id='To'])[3]")).sendKeys("mum");
		driver.findElement(By.xpath("//div[@class='row airport-country-detail']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='col-lg-4 col-12 booking-flight-btn']")).click();
		
	}

}
