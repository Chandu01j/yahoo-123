package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooMailPage {
	
	// Variable : WebElement :Login Or Sign Up Page
	
		@FindBy (xpath = "//a[@class='_yb_8ebez']")
		private WebElement inboxMail ;
		
		@FindBy (xpath = "(//div[@data-test-id='folder-list']//span)[13]")
		private WebElement sentMail ;
		
		@FindBy (xpath = "//input[@role='combobox']")
		private WebElement mailSearchTab ;
		
		@FindBy (xpath = "//button[@title='Search']")
		private WebElement searchMail ;
		
		@FindBy (xpath = "(//div[@data-test-id='folder-list']//span)[10]")
		private WebElement draftsMail ;
		
	   @FindBy (xpath = "(//div[@data-test-id='folder-list']//span)[24]")
		private WebElement deletedItems ;
		
		@FindBy (xpath = "(//div[@data-test-id='folder-list']//span)[21]")
		private WebElement spamMail ;
		
		@FindBy (xpath = "//a[@aria-label='Compose']")
		private WebElement compose ;
		
		@FindBy (xpath = "(//input[@role='combobox'])[2]")
		private WebElement tosentMail ;
		

		@FindBy (xpath = "//input[@data-test-id='compose-subject']")
		private WebElement subject ;
		
		@FindBy (xpath = "//div[@aria-label='Message body']")
		private WebElement messageBody ;
		
		@FindBy (xpath = "//span[text()='Send']")
		private WebElement sendButton ;
		
		@FindBy (xpath = "//button[@id='ybarAccountMenu']")
		private WebElement profileAcc ;
		
		@FindBy (xpath = "//span[text()='Sign out']")
		private WebElement signOutButton ;
		
		
		
		// Constructor : Initialization of WebElement : Login Or Sign Up Page
		
		private WebDriver driver;
		
			 public YahooMailPage(WebDriver driver) {
				 PageFactory.initElements(driver, this);
				 this.driver = driver ;
			 }
			 
			 //Methods : Action on WebElement : Login Or Sign Up Page
			 
			  public void clickoninboxMail() {
				  inboxMail.click();
			 }
			  
			  public void clickonSentMail() {
				  sentMail.click();
			 }
			  
			  public void sendMailSearchTab() {
				  mailSearchTab.sendKeys("yahoo");
				  
			 }
			  
			  public void clickonSearchMail() {
				  searchMail.click();
			 }
			  public void clickonDraftsMail() {
				  draftsMail.click();
			 }
			  
			  public void clickonDeletedItems() {
				  deletedItems.click();
			 }
			  
			  public void clickonSpamMail() {
				  spamMail.click();
			 }
			  public void clickonCompose() {
				  
				  compose.click();
			 }
			  
             public void sendtosentMail() {  
            	 tosentMail.sendKeys("cbharsawde94@gmail.com");
			 }
             
             public void sendsubject() {  
            	 subject.sendKeys("hiii");
			 }
             
             
             public void sendMessageBody() {  
            	 messageBody.sendKeys("hello chandrakant bharsawde");
			 }
             
             public void clickonSendButton() {  
            	 sendButton.click();
			 }
             public void clickonProfileAcc() {  
            	 profileAcc.click();
			 }
             public void clickonSignOutButton() {  
            	 signOutButton.click();
			 }


}
