package com.automation.dental.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.automation.dental.base.TestBase;

public class NewPatients extends TestBase{

	@Test
	public void newPatients() throws Exception
	{
		driver.get("https://www.rousehillsmilesdentalcare.com.au/");
		driver.findElement(By.linkText("New Patients")).click();
		//System.out.println(driver.getTitle());
		String exptitle="New Patient Appointments | Top Dentist Rouse Hill";
		String acttitle=driver.getTitle();
		if(exptitle.equals(acttitle))
			System.out.println("pass");
		//driver.findElement(By.xpath("(//a[text()='Special offers'])[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.linkText("health.com.au")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
	    ContactUs c=new ContactUs();
		c.ContactUs();
		driver.navigate().back();
	}
}
