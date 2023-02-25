package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooSearchPage {
	
	
	
	// Variable : WebElement :Login Or Sign Up Page
	
	@FindBy (xpath = "//div[@title='Sign In']")
	private WebElement signInbutton ;
	
	@FindBy (xpath = "//div[@title='Mail']")
	private WebElement mailButton ;
	
	@FindBy (xpath = "//input[@id='yschsp']")
	private WebElement yahooSearchtab ;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement searchButton ;
	
	@FindBy (xpath = "(//div[@id='horizontal-bar']//a)[1]")
	private WebElement searchImage ;
	
	@FindBy (xpath = "(//div[@id='horizontal-bar']//a)[2]")
	private WebElement searchvideo ;
	
	@FindBy (xpath = "(//div[@class='results clearfix']//h3)[1]")
	private WebElement firstvideoPlay ;
	
	@FindBy (xpath = "//button[@aria-label='Play']")
	private WebElement playButton ;
	
	@FindBy (xpath = "(//ol[@class='reg searchSuperTop']//a)[5]")
	private WebElement weatherCheck ;
	
	
	// Constructor : Initialization of WebElement : Login Or Sign Up Page
	
	private WebDriver driver;
	
		 public YahooSearchPage(WebDriver driver) {
			 PageFactory.initElements(driver, this);
			 this.driver = driver ;
		 }
		 
		 //Methods : Action on WebElement : Login Or Sign Up Page
		 
		  public void clickonSignInbutton() {
			  signInbutton.click();
		 }
		  
		  public void clickonMailButton() {
			  mailButton.click();
		 }
		  
		  public void sendyahooSearchtab() {
			  yahooSearchtab.sendKeys("salman khan");
			  
		 }
		  
		  public void clickonSearchButton() {
			  searchButton.click();
		 }
		  public void clickonSearchImage() {
			  searchImage.click();
		 }
		  
		  public void clickonSearchvideo() {
			  searchvideo.click();
		 }
		  
		  public void clickonFirstvideoPlay() {
			  firstvideoPlay.click();
		 }
		  public void clickonPlayButton() {
		//	  WebDriverWait wait = new WebDriverWait(driver,20);
		//	  wait.until(ExpectedConditions.visibilityOf(playButton));
			  playButton.click();
		 }
		  
		  
		  public void clickonWeatherCheck() {
			  weatherCheck.click();
		 }


}
