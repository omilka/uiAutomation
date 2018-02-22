package com.test.automation.uiAutomation.homePage;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;

public class TC001_VerifyLoginWithInvalidCredentials extends TestBase{
    
	
	HomePage homepage;
	
	@BeforeTest
	public void setUp()  {
		init();

	}
	
	@Test
    public void verifyLoginWithInvalidCredentials() {	
		homepage = new HomePage(driver);
		homepage.loginToApplication("medyanik@gmail.com", "password^$");

	Assert.assertEquals(homepage.getInvalidLoginText(), "WELCOME TO OUR STORE FOR GREAT SAVINGS ON TEST TOOLS AND CALIBRATION.");
	}
    
	@AfterTest
    public void endTest() {
		driver.close();
		
}
}