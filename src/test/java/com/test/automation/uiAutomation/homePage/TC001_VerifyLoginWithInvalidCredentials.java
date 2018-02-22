package com.test.automation.uiAutomation.homePage;

import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.uiActions.HomePage;

public class TC001_VerifyLoginWithInvalidCredentials {
    
	WebDriver driver;
	HomePage homepage;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
	//	System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "/drivers/geckodriver");
		driver = new ChromeDriver();
		driver.get("http://www.usamultimeters.com/default.aspx");
	}
	
	@Test
    public void verifyLoginWithInvalidCredentials() {	
		homepage = new HomePage(driver);
		homepage.loginToApplication("medyanik@gmail.com", "password^$");

	Assert.assertEquals(homepage.getInvalidLoginText(), "WELCOME TO OUR STORE FOR GREAT SAVINGS ON TEST TOOLS AND CALIBRATION.");
	}
    
	@AfterClass
    public void endTest() {
		driver.close();
		
}
}