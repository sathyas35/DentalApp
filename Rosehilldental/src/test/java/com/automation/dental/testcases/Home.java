package com.automation.dental.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.automation.dental.base.TestBase;

public class Home extends TestBase{
	@Test
	public void homeScreen() throws Exception
	{
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Special Offers »")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Terms and conditions")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.linkText("Zip Money")).click();
		driver.findElement(By.xpath("//span[text()='Create Your Account']")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Visit Help Centre")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.linkText("Exams and Cleaning")).click();
		Services s=new Services();
		s.DentalExams();
		driver.navigate().back();
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("Children’s Dentistry")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Fillings")).click();
		s.Fillings();
		driver.navigate().back();
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("Extractions")).click();
		s.wisteethrem();
		driver.navigate().back();
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("Inlays and Onlays")).click();
		s.inlays();
		driver.navigate().back();
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("Dentures")).click();
		s.dentures();
		driver.navigate().back();
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("Emergency Dental Care")).click();
		s.EM_Dental();
		driver.navigate().back();
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("Teeth Whitening")).click();
		s.teethwhitening();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Home")).click();
		
	}

}
