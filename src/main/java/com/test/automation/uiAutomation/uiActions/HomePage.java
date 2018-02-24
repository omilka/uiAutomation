package com.test.automation.uiAutomation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
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
	
	
	public void loginToApplication(String emailAddress, String password){
		signIn.click();
		log.info("cliked on sign in and object is:-"+signIn.toString());
		loginEmailAddress.sendKeys(emailAddress);
		log.info("entered email address:-"+emailAddress+" and object is "+loginEmailAddress.toString());
		loginPassword.sendKeys(password);
		log.info("entered password:-"+password+" and object is "+loginPassword.toString());
		submitButton.click();
	    log.info("clicked on sublit butto and object is:-"+submitButton.toString());
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
			logout.isDisplayed();
			log.info("logout is dispalyed and object is:-"+logout.toString());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnLogout() {
		logout.click();
	}
	
	public String getLogoutText(){
		log.info("message is:-"+logoutSuccess.getText());
		return logoutSuccess.getText();
	}
}
/* 
	public void registorUser(String product, String lastName, String emailAddress, String password){
		signUpLink.click();
		log("clicked on sign Up link and object is:-"+signUpLink.toString());
		
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
		log("entered data to first name field and object is:-"+this.firstName.toString());
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
		log("entered data to last name field and object is:-"+this.lastName.toString());
		email.clear();
		email.sendKeys(emailAddress);
		log("entered data to email field and object is:-"+email.toString());
		createPassword.clear();
		createPassword.sendKeys(password);
		log("entered data to password field and object is:-"+createPassword.toString());
		createAccount.click();
		log("clicked on craete and account and object is:-"+signUpLink.toString());
	}
	



	
	public void clickOnNavigationMenu(String menuName){
		driver.findElement(By.xpath("//button[contains(text(),'"+menuName+"') and @aria-expanded='false']")).click();
		log("clicked on:-"+menuName+" navigation menu");
	}
	
	public void clickOnProductInMensSection(String product){
		
		waitForElement(driver, 80, driver.findElement(By.xpath(".//button[contains(text(),'Mens') and @aria-expanded='true']/following-sibling::ul/child::li/child::a[contains(text(),'"+product+"')]")));
		driver.findElement(By.xpath(".//button[contains(text(),'Mens') and @aria-expanded='true']/following-sibling::ul/child::li/child::a[contains(text(),'"+product+"')]")).click();
		log("clicked on:-"+product);
	}
	
	public void clickOnProductInWomensSection(String product){
		waitForElement(driver, 80, driver.findElement(By.xpath(".//button[contains(text(),'Womens') and @aria-expanded='true']/following-sibling::ul/child::li/child::a[contains(text(),'"+product+"')]")));
		driver.findElement(By.xpath(".//button[contains(text(),'Womens') and @aria-expanded='true']/following-sibling::ul/child::li/child::a[contains(text(),'"+product+"')]")).click();
	}
	
	public void switchToFrame(){
		driver.switchTo().frame(homePageIframe);
		log("switched to the iframe");
	}
	
	public void switchToDefaultContent(){
		driver.switchTo().defaultContent();
		log("switched to the default Content");
	}
	
	public void log(String data){
		log.info(data);
		Reporter.log(data);
		
	}
	
}
	*/
	

