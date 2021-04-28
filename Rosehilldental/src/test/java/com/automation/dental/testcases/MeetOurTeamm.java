package com.automation.dental.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.automation.dental.base.TestBase;
@Test
public class MeetOurTeamm extends TestBase {
	public void MeetOurTeam() throws Exception
	{
	driver.findElement(By.linkText("Meet Our Team")).click();
	driver.findElement(By.linkText("READ MORE")).click();
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,550)", "");
	
	
	driver.findElement(By.linkText("dental care to children")).click();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	
	
	String exptitle="Children's Dentist in Rouse Hill | Best Children's Dentist";
	String acttitle=driver.getTitle();
	if(exptitle.equals(acttitle)) {
		System.out.println("Pass");
	}
	//js.executeScript("window.scrollBy(0,1000)", "");
	//js.executeScript("window.scrollBy(0,550)", "");
	//js.executeScript("window.scrollBy(0,550)", "");////js.executeScript("window.scrollBy(0,550)", "");
	//js.executeScript("window.scrollBy(0,550)", "");
	//driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
	//ContactUs c=new ContactUs();
	//c.ContactUs();
	driver.navigate().back();
	Thread.sleep(2000);
	
	
	driver.findElement(By.linkText("creates and fits dentures")).click();
    exptitle="Dentures Treatment in Rouse Hill | Denture Repair";
    acttitle=driver.getTitle();
    if(exptitle.equals(acttitle))
	System.out.println("Pass");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
    ContactUs c=new ContactUs();
	c.ContactUs();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
    
	
	

	}

}
