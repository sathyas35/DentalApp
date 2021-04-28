package com.automation.dental.testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.dental.base.TestBase;

public class TopLinksV extends TestBase{
@Test
	public void LinksVerification() throws Exception
	{
		driver.findElement(By.className("office_hours")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("office_hours")).click();
		driver.findElement(By.linkText("Email Us")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='paoc-popup-close paoc-close-popup']")).click();
		driver.findElement(By.xpath("//a[@class='top-phone-text']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='fa fa-facebook bgtoph-icon-clr']")).click();
		String exptitle="Rouse Hill Smiles Dental Care - Home | Facebook";
		Set<String> windowHandles = driver.getWindowHandles();
	    Object[] windows = windowHandles.toArray();
	    driver.switchTo().window(windows[1].toString());
	    String acttitle=driver.getTitle();
	    Assert.assertEquals(acttitle, exptitle);
	    
	    System.out.println("Pass");
	    driver.close();
	    driver.switchTo().window(windows[0].toString());
	    driver.findElement(By.xpath("//span[@class='fa fa-twitter bgtoph-icon-clr']")).click();
	    Thread.sleep(2000);
	    Set<String> windowHandles1 = driver.getWindowHandles();
	    Object[] windows1 = windowHandles1.toArray();
	    driver.switchTo().window(windows1[1].toString());
	    driver.close();
	    driver.switchTo().window(windows1[0].toString());
	    driver.findElement(By.xpath("//span[@class='fa fa-google bgtoph-icon-clr']")).click();
	    Thread.sleep(2000);
	    Set<String> windowHandles2 = driver.getWindowHandles();
	    Object[] windows2 = windowHandles2.toArray();
	    driver.switchTo().window(windows2[1].toString());
	    driver.close();
	    driver.switchTo().window(windows2[0].toString());
	    
	    driver.findElement(By.linkText("Home")).click();
	    
	    driver.findElement(By.linkText("About us")).click();
	    
	    driver.findElement(By.linkText("Meet Our Team")).click();
		
		
	    driver.findElement(By.linkText("Services")).click();
	   
	    driver.findElement(By.linkText("New Patients")).click();
	  
	    driver.findElement(By.linkText("Book Now")).click();
	}
}
