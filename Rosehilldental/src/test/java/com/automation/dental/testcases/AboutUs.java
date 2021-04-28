package com.automation.dental.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.dental.base.TestBase;

public class AboutUs extends TestBase{

	@Test
	public void aboutus()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		String exptitle="About Us | Rouse Hill Smiles Dental Care";
		String acttitle=driver.getTitle();
		Assert.assertEquals(acttitle, exptitle);
		
			System.out.println("pass");
		
		
		driver.navigate().back();
	}
	
}
