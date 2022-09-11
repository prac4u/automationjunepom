package com.orangehrm.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orangehrm.qa.listeners.TestNgListener;
import com.orangehrm.qa.utils.StringUtil;

public class HomePage {
	
	WebDriver driver;
	static Logger log = Logger.getLogger(TestNgListener.class.getName());
	
	//WebElement 
	By username = By.className("oxd-userdropdown-name");
	
	By menuItemNames = By.xpath("//span[contains(@class, 'oxd-main-menu-item--name')]");
	
	By pageHeader = By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6");
	
	String xpath = "//li[text()='RANDOM']";
					
	
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//PageActions
	
	public String getUsername()
	{
		
		log.info("Inside Home Page " + " getUserName Method");
	
		
		String user = driver.findElement(username).getText();
		log.info("Username Found : " +  user);
		
		
		
		
		return user;
	}
	
	
	public String getTitle()
	{
		log.info("Inside Home Page " + " getTitle Method");
		
		String title = driver.findElement(pageHeader).getText();
		
		log.info("Title : " +  title);
		return title;
	}
	
	
	public List<String> getMenuItems()
	{
		
		log.info("Inside Home Page " + " getMenuItems Method");
		List<WebElement> list = driver.findElements(menuItemNames);
		
		List<String> names = new ArrayList();
		
		
		for(WebElement e:  list)
		{
			 names.add(e.getText());
		}
		
		log.info("Menu List : " +  names);
		return names;
	}
	
	
	public void selectDate(String date, String month, String year)
	{
		log.info("Inside Home Page " + " selectDate Method");
		driver.findElement(By.xpath(StringUtil.getNewXpath(xpath, date)));
	}

}
