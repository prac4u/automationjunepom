package com.orangehrm.qa.driverfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
	WebDriver driver;
	
	public WebDriver init_driver()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		tldriver.set(driver);
		return tldriver.get();
		
	}
	
	
	
	public WebDriver getDriver()
	{
		
		return tldriver.get();
	}

}
