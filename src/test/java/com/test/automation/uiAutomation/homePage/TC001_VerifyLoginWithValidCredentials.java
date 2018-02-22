package com.test.automation.uiAutomation.homePage;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;

public class TC001_VerifyLoginWithValidCredentials extends TestBase{
    
	public static final Logger log = Logger.getLogger(TC001_VerifyLoginWithValidCredentials.class.getName());
	
	
	HomePage homepage;
	
	@BeforeTest
	public void setUp()  {
		init();

	}
	
	@Test
    public void verifyLoginWithInvalidCredentials() {	
		log.info("========Starting TC001_VerifyLoginWithInvalidCredentials test");
		homepage = new HomePage(driver);
		homepage.loginToApplication("omilka@gmail.com", "Minimicr0");

	Assert.assertEquals(homepage.getInvalidLoginText(), "WELCOME TO OUR STORE FOR GREAT SAVINGS ON TEST TOOLS AND CALIBRATION.");
	log.info("========End TC001_VerifyLoginWithInvalidCredentials test");
	
	}
    
	@AfterTest
    public void endTest() {
		driver.quit();
		
}
}