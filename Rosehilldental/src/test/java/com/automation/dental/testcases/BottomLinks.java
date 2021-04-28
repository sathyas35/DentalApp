package com.automation.dental.testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.automation.dental.base.TestBase;

import junit.framework.Assert;

public class BottomLinks extends TestBase {

	@SuppressWarnings("deprecation")
	@Test
	public void btmlnks()
	{
		driver.findElement(By.linkText("Copyright")).click();
		String exptitle="Copyright | Rouse Hill Smiles Dental Care";
		String acttitle=driver.getTitle();
		Assert.assertEquals(exptitle, acttitle);
		Reporter.log("copyright validated");
		driver.navigate().back();
		driver.findElement(By.linkText("Legel")).click();
		exptitle="Legal Disclaimer | Rouse Hill Smiles Dental Care";
		acttitle=driver.getTitle();
		Assert.assertEquals(exptitle, acttitle);
		Reporter.log(",br>");
		Reporter.log("Legal Disclaimer validated");
		driver.navigate().back();
		driver.findElement(By.linkText("Privacy")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Accessibility")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Sitemap")).click();
		driver.navigate().back();
		
	}
}
