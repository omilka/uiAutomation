package com.test.automation.uiAutomation.homePage;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;

public class TC003_VerifyLogout extends TestBase{


	public static final Logger log = Logger.getLogger(TC003_VerifyLogout.class.getName());
	
	
	HomePage homepage;
	
	@BeforeTest
	public void setUp()  {
		init();

	}
	
	@Test(priority=0)
    public void verifyAddProductToCard() {	
		log.info("========TC003_VerifyLogout=======");
		homepage = new HomePage(driver);
		homepage.loginToApplication("omilka@gmail.com", "Minimicr0");
		Assert.assertTrue(homepage.verifyLogoutDisplay());
        homepage.clickOnLogout();
        Assert.assertEquals(homepage.getLogoutText(), "WELCOME, PLEASE SIGN IN!");
		log.info("=======TC003_VerifyLogout========");
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for (int i = 1; i<=links.size(); i++)
	{
	 	System.out.println(links.get(i).getText());
	 	}
	 	
	
	}
   
	@AfterClass
	public void endTest() {
	driver.quit();

	}
	

}