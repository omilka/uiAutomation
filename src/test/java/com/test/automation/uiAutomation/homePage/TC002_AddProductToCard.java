package com.test.automation.uiAutomation.homePage;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;

public class TC002_AddProductToCard extends TestBase{


	public static final Logger log = Logger.getLogger(TC002_AddProductToCard.class.getName());
	
	
	HomePage homepage;
	
	@BeforeTest
	public void setUp()  {
		init();

	}
	
	@Test
    public void verifyAddProductToCard() {	
		log.info("========Starting TC002_AddProductToCard test");
		homepage = new HomePage(driver);
		homepage.addProductToCart("Druck DPI620G");
Assert.assertTrue(homepage.getCheckoutButton());
	log.info("========End TC002_AddProductToCard test");
	
	}
    
	@AfterTest
    public void endTest() {
		driver.quit();
		
}
}