package com.orangehrm.qa.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	
	
	public static void takeScreenshot(WebDriver driver, String screenshotName)
	{
		
		String pathName = System.getProperty("user.dir");
		String fullPath = pathName + File.separator + "screenshots" +File.separator + screenshotName + ".jpg";
		System.out.println(fullPath);
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(fullPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
