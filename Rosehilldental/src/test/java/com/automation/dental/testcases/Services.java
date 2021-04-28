package com.automation.dental.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.dental.base.TestBase;

public class Services extends TestBase{
	@Test(priority=1)
	public void DentalExams() throws InterruptedException
	{
		driver.findElement(By.linkText("Services")).click();
		driver.findElement(By.linkText("Dental Exams and Cleanings")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		
		driver.findElement(By.linkText("Rouse Hill Smiles")).click();
		AboutUs abtus=new AboutUs();
		abtus.aboutus();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
		ContactUs c=new ContactUs();
		c.ContactUs();
		driver.navigate().back();
		driver.navigate().back();
	}
	@Test(priority=2)
	public void Fillings() throws InterruptedException
	{
		driver.findElement(By.linkText("Services")).click();
		driver.findElement(By.linkText("Fillings")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
		ContactUs c=new ContactUs();
		c.ContactUs();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
	@Test(priority=3)
	public void RootCanal() throws InterruptedException
	{
		driver.findElement(By.linkText("Services")).click();
		driver.findElement(By.linkText("Root Canal")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.linkText("Rouse Hill Smiles")).click();
		String exptitle="Rouse Hill Smiles Dental Care | Affordable Dental Care";
		String acttitle=driver.getTitle();
		Assert.assertEquals(acttitle, exptitle);
		
			System.out.println("pass");
		
		
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
		ContactUs c=new ContactUs();
		c.ContactUs();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
	@Test(priority=4)
	public void EM_Dental() throws InterruptedException
	{

		driver.findElement(By.linkText("Services")).click();
		driver.findElement(By.linkText("Emergency Dental Care")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
		ContactUs c=new ContactUs();
		c.ContactUs();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
	@Test(priority=5)
	public void implant() throws InterruptedException
	{
		driver.findElement(By.linkText("Services")).click();
		driver.findElement(By.linkText("Implants")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.linkText("Rouse Hill Smiles")).click();
		AboutUs abtus=new AboutUs();
		abtus.aboutus();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
		ContactUs c=new ContactUs();
		c.ContactUs();
		driver.navigate().back();
		driver.navigate().back();
		//driver.navigate().back();
	}
	@Test(priority=6)
	public void inlays() throws Exception
	{
		driver.findElement(By.linkText("Services")).click();
		driver.findElement(By.linkText("Inlays and Onlays")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("dental filling")).click();
		driver.navigate().back();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
		ContactUs c=new ContactUs();
		c.ContactUs();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
	}
	
	@Test(priority=7)
	public void teethwhitening() throws Exception
	{
		driver.findElement(By.linkText("Services")).click();
		driver.findElement(By.linkText("Teeth Whitening")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.linkText("Rouse Hill Smiles")).click();
		AboutUs abtus=new AboutUs();
		abtus.aboutus();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
		ContactUs c=new ContactUs();
		c.ContactUs();
		driver.navigate().back();
		driver.navigate().back();
		//driver.navigate().back();
	}
	@Test(priority=8)
	public void QuickStraightTeeth() throws Exception
	{
		driver.findElement(By.linkText("Services")).click();
		driver.findElement(By.linkText("Quick Straight Teeth")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
		ContactUs c=new ContactUs();
		c.ContactUs();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
	}
	@Test(priority=9)
	public void veeners() throws InterruptedException
	{
		driver.findElement(By.linkText("Services")).click();
		driver.findElement(By.linkText("Veneers")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
		ContactUs c=new ContactUs();
		c.ContactUs();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=10)
	public void wisteethrem() throws Exception
	{
		driver.findElement(By.linkText("Services")).click();
		driver.findElement(By.linkText("Wisdom Teeth Removal")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.linkText("Rouse Hill Smiles")).click();
		AboutUs abtus=new AboutUs();
		abtus.aboutus();
		driver.navigate().back();*/
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
		ContactUs c=new ContactUs();
		c.ContactUs();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
	}
	@Test(priority=11)
	public void dentures() throws Exception
	{
		driver.findElement(By.linkText("Services")).click();
		driver.findElement(By.linkText("Dentures")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.linkText("dental implants")).click();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
		ContactUs c=new ContactUs();
		c.ContactUs();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
	}
}
