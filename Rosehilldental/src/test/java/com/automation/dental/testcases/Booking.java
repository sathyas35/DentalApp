package com.automation.dental.testcases;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.automation.dental.base.TestBase;


public class Booking extends TestBase {
	@Test
	public void bookapp() throws Exception
	{
	driver.findElement(By.linkText(OR.getProperty("bknw"))).click();
	Thread.sleep(3000);
	 Thread.sleep(5000);
     WebElement bookurappt = driver.findElement(By.xpath("//span[text()='Click Here to Book Your Appointment Online']"));
     bookurappt.click();
     Thread.sleep(2000);
     Set<String> windowHandles = driver.getWindowHandles();
     Object[] windows = windowHandles.toArray();
     driver.switchTo().window(windows[1].toString());
     WebElement reason = driver.findElement(By.className("selectize-input"));
     reason.click();
     driver.findElement(By.xpath("//div[text()='Broken / Chipped tooth']")).click();
     driver.findElement(By.xpath("(//div[@class='selectize-input'])[2]")).click();
     Thread.sleep(2000);
    
     driver.findElement(By.xpath("//div[text()='Dr Swapnil Diwakirti']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//label[text()='4:15 PM']")).click();
  
     Thread.sleep(2000);
    // driver.findElement(By.xpath("//div[text()='Mrs.']")).click();
     Thread.sleep(1000);
     driver.findElement(By.id("firstName")).sendKeys("Sathya Prabha");
     Thread.sleep(1000);
     driver.findElement(By.id("lastName")).sendKeys("Senthil Kumar");
     Thread.sleep(1000);
     driver.findElement(By.id("datepicker")).sendKeys("29-12-1987");
     driver.findElement(By.id("datepicker")).sendKeys(Keys.TAB);
     Thread.sleep(1000);
     driver.findElement(By.id("eMail")).sendKeys("sathyas35@gmail.com");
     Thread.sleep(1000);
	
	driver.switchTo().window(windows[0].toString());
	
	driver.navigate().back();
	
	//driver.close();
	}

}
