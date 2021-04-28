package com.automation.dental.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver;
	public static String exptitle;
	public static String acttitle;
	public static Properties config =new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	
	
	
	@BeforeSuite
	public void setUp() throws Exception
	{
		if(driver==null)
		{
			FileInputStream fis = new FileInputStream("C:\\DentalApp\\Rosehilldental\\src\\test\\resources\\properties\\Config.properties");
			config.load(fis);
			if(config.getProperty("browser").equals("chrome"))
					{
				System.setProperty("webdriver.chrome.driver", "C:\\DentalApp\\Rosehilldental\\src\\test\\resources\\Executables\\chromedriver.exe");
				driver = new ChromeDriver();
					}
			else
			{
				System.setProperty("webdriver.gecko.driver", "C:\\DentalApp\\Rosehilldental\\src\\test\\resources\\Executables\\geckodriver.exe");
				driver= new FirefoxDriver();
			}
		
	
		driver.get(config.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicitwait")), TimeUnit.SECONDS);
		fis=new FileInputStream("C:\\DentalApp\\Rosehilldental\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		
		
		}	
}
	@AfterSuite
	public void tearDown() {
		driver.quit();
		
	}
}