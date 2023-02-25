package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooLoginPage {
	
	
	// Variable : WebElement :Login Or Sign Up Page
	
//	@FindBy (xpath = "//input[@id='login-username']")
//	private WebElement userNameId ; 
	
	@FindBy (xpath = "//input[@id='login-username12355']")
	private WebElement userNameId12456 ; 
	
	@FindBy (xpath = "//input[@id='login-signin']")
	private WebElement nextButton ; 
	

	@FindBy (xpath = "//input[@id='login-passwd']")
	private WebElement loginPassword ;
	
	@FindBy (xpath = "//button[@id='login-signin']")
	private WebElement loginSubmitButton ;
	
	
	

	@FindBy (xpath = "//a[@id='createacc']")
	private WebElement creataccountButton ; 

	@FindBy (xpath = "//input[@id='usernamereg-firstName']")
	private WebElement firstName ; 

	@FindBy (xpath = "//input[@id='usernamereg-lastName']")
	private WebElement lastName ; 
	
	@FindBy (xpath = "//input[@id='usernamereg-userId']")
	private WebElement userId ;
	
	@FindBy (xpath = "//input[@id='usernamereg-password']")
	private WebElement password ;
	
	@FindBy (xpath = "//input[@id='usernamereg-birthYear']")
	private WebElement birthYear ;
	
	@FindBy (xpath = "//button[@id='reg-submit-button']")
	private WebElement submitButton ;
	
	// Constructor : Initialization of WebElement : Login Or Sign Up Page
	
	 public YahooLoginPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //Methods : Action on WebElement : Login Or Sign Up Page
	 
	  public void sendUserNameId() {
		  userNameId.click();
		  userNameId.sendKeys("cbharsawde3373");
	 }
	  
	  public void clickonNextButton() {
		  nextButton.click();
		 }
	  
	  public void sendLoginPassword() {
		  loginPassword.click();
		  loginPassword.sendKeys("Chandu@123");
		 }
	  
	  public void clickonLoginSubmitButton() {
		  loginSubmitButton.click();
		 }
	  
	  
	  public void clickonCreataccountButton() {
		  creataccountButton.click();
		 }
	  
	  public void sendfirstName() {
		  firstName.click();
		  firstName.sendKeys("chandrakant");
		 }
	  
	  public void sendlastName() {
		  lastName.click();
		  lastName.sendKeys("bharsawde");
		 }
	  
	  public void senduserId() {
		  userId.click();
		  userId.sendKeys("cbharsawde33734");
		 }
	  
	  public void sendpassword() {
		  password.click();
		  password.sendKeys("Chandu@123");
		 }
	  
	  public void sendbirthYear() {
		  birthYear.click();
		  birthYear.sendKeys("1990");
		 }
	  
	  public void clickonSubmitButton() {
		  submitButton.click();
		 }
	  
	 //group og action
	  
	  public void login() {
		  userNameId.sendKeys("cbharsawde3373");
		  nextButton.click();
		  loginPassword.sendKeys("Chandu@123");
		  loginSubmitButton.click();
	  }
	 
}


