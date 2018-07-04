package com.test.automation.uiAutomation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.uiAutomation.testBase.TestBase;

public class HomePage extends TestBase {

	
	public static final Logger log = Logger.getLogger(HomePage.class.getName());
	
	
	WebDriver driver;
		
	
	@FindBy(xpath="//*[@id='ctl00_ctrlHeader_LinkButtonSignIn']")
	WebElement signIn;
	
	@FindBy(xpath="//*[@id='ctl00_ctrlHeader_LoginForm_UserName']")
	WebElement loginEmailAddress;
	
	@FindBy(xpath="//*[@id='ctl00_ctrlHeader_LoginForm_Password']")
	WebElement loginPassword;
	
	@FindBy(id="ctl00_ctrlHeader_LoginForm_LoginButton")
	WebElement submitButton;
	
	@FindBy(xpath="//*[@id='aspnetForm']/div[3]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[1]/h4")
	WebElement authenticationSuccess;
	
	@FindBy(id="ctl00_ctrlHeader_LinkButtonSignUp")
	WebElement signUpLink;
	
	@FindBy(id="ctl00_ctrlHeader_txtSearchTerms")
	WebElement searchInput;
	
	@FindBy(id="ctl00_ctrlHeader_btnSearch_Click")
	WebElement searchButton;
	
	@FindBy(id="ctl00_cph1_ctrlSearch_dlCatalog_ctl00_ctrlProductBox_btnAddToCart")
	WebElement addToCart;
	
	
	@FindBy(id="ctl00_cph1_OrderSummaryControl_btnCheckout")
	WebElement checkoutButton;
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[3]/div[1]/table/tbody/tr/td/div[1]/table/tbody/tr/td[9]/div[2]/table/tbody/tr[2]/td[3]/a")
	WebElement logout;
	
	@FindBy(xpath="//*[@id='aspnetForm']/div[3]/table/tbody/tr/td/table/tbody/tr/td/div/div[1]")
	WebElement logoutSuccess;
	
	@FindBy(id="CreatePassword")
	WebElement createPassword;
	
	@FindBy(css="input.btn")
	WebElement createAccount;
	
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginToApplication(String emailAddress, String loginPassword){
		signIn.click();
		log.info("cliked on sign in and object is:-"+signIn.toString());
		loginEmailAddress.sendKeys(emailAddress);
		log.info("entered email address:-"+emailAddress+" and object is "+loginEmailAddress.toString());
		this.loginPassword.sendKeys(loginPassword);
		log.info("entered password:-"+loginPassword+" and object is "+loginPassword.toString());
		submitButton.click();
	    log.info("clicked on submit button and object is:-"+submitButton.toString());
	}
	

	
	
public String getInvalidLoginText(){
		log.info("message is:-"+authenticationSuccess.getText());
		return authenticationSuccess.getText();
	}

	public void addProductToCart(String productName) {
	searchInput.sendKeys(productName);
	log.info("clicked on search Input "+productName+" and object is:-"+searchInput.toString());
	searchButton.click();
	log.info("clicked on search button and object is:-"+searchButton.toString());
	addToCart.click();
	log.info("clicked on add to card button and object is:-"+addToCart.toString());
}

	public boolean getCheckoutButton(){
		try {
		log.info("Checkout button is present:-"+checkoutButton.isDisplayed());
     checkoutButton.isDisplayed();
	 return true;
	} catch (Exception e) {
	   return false;
	}
	}
	
	public boolean verifyLogoutDisplay(){
		try {
		//	waitForElement(logout, 300);
			logout.isDisplayed();
			log.info("logout is dispalyed and object is:-"+logout.toString());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnLogout() {
		logout.click();
		log.info("clicked on logout button and object is:"+ logout.toString());
	}
	
	public String getLogoutText(){
		log.info("message is:-"+logoutSuccess.getText());
		return logoutSuccess.getText();
	}

}
	

	

	
	

