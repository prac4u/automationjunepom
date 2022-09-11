package com.orangehrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	//Elements
	private By username = By.name("username");
	private By password	= By.name("password");
	private By loginButton = By.tagName("button");
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	//PageActions
	public void enterUsername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	
	public HomePage login(String username, String pass)
	{
		enterUsername(username);
		enterPassword(pass);
		clickLoginButton();
		return new HomePage(driver);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean isUsernamePresent()
	{
		return driver.findElement(username).isDisplayed();
	}

}
