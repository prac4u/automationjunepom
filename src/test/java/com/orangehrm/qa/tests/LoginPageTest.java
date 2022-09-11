package com.orangehrm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.qa.basetest.BaseTest;
import com.orangehrm.qa.constants.Constants;
import com.orangehrm.qa.pages.HomePage;
public class LoginPageTest extends BaseTest{
	
	@Test(priority = 3)
	public void loginTest()
	{
		String expected = "PIM";
		 homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));	
		String actual = homePage.getTitle();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 1)
	public void verifyLoginPageTitle()
	{
		String actual = loginPage.getPageTitle();
		Assert.assertEquals(actual, Constants.LOGIN_PAGE_TITLE);
		
	}
	
	@Test(priority = 2)
	public void usernamePresence()
	{
		
		boolean actual = loginPage.isUsernamePresent();
		Assert.assertEquals(actual, true);
	}
	

}
