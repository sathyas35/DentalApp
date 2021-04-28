package com.automation.dental.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.automation.dental.base.TestBase;

public class Screenshots extends TestBase{
	
	public static String path;
	public static String screenshotname;
	
	public static void capturescrnshot() throws IOException {
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		path="C:\\DentalApp\\Rosehilldental\\target\\surefire-reports\\html\\error.JPEG";
		File destination= new File(path);
		//Date d= new Date();	
		//screenshotname="error.JPEG";
		
		//screenshotName=d.toString().replace(":", "_").replace(" ", "_");
		//screenshotPath="C:\\DentalApp\\Rosehilldental\\target\\surefire-reports\\html";
		
		FileUtils.copyFile(src,destination);
	}

}
