package com.automation.dental.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.dental.base.TestBase;

public class ContactUs extends TestBase{

	@Test
	public void ContactUs() throws InterruptedException
	{
		
	    driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("Hi, wanted to check if any appointments available");
	    Thread.sleep(3000);
	    driver.findElement(By.name("first_name")).sendKeys("Sathya");
	    driver.findElement(By.name("last_name")).sendKeys("Senthil");
	    driver.findElement(By.xpath("//input[@value='Email']")).click();
	    driver.findElement(By.name("your-email")).sendKeys("sathyas35@gmail.com");
	    driver.findElement(By.name("your-phone")).sendKeys("0405060358");
	    driver.findElement(By.name("checkbox-676[]")).click();
	    driver.findElement(By.linkText("privacy policy")).click();
	    driver.navigate().back();
	    driver.navigate().back();
		
		
		//span[text()='Contact Us']
	}
}
