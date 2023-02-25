package testNg;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.YahooLoginPage;

public class TestNgClass1 {
	 WebDriver driverTest ;
	 @BeforeClass
	public void LunchBrowser() {
      System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	    driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();	
	}
	
	@BeforeMethod
	public void goToHomePage()
	{
		driverTest.get("https://login.yahoo.com/");
	}
	
	@Test
	public void VerifyCreateAccount() {
		YahooLoginPage yahooLoginPage = new YahooLoginPage(driverTest);
		yahooLoginPage.clickonCreataccountButton();
		yahooLoginPage.sendfirstName();
		yahooLoginPage.sendlastName();
		yahooLoginPage.senduserId();
		yahooLoginPage.sendpassword();
		yahooLoginPage.sendbirthYear();
	//	yahooLoginPage.clickonSubmitButton();
		
	}
	
	@Test
	public void VerifySignInPage() {
		YahooLoginPage yahooLoginPage = new YahooLoginPage(driverTest);
		yahooLoginPage.login();
	}
	
	@AfterMethod
	public void BackPage() {
		
		ArrayList<String> addr = new ArrayList<String> (driverTest.getWindowHandles());
		driverTest.switchTo().window(addr.get(0));//switch to child browser
	}
	
	@AfterClass
	public void closedbrowser() {
		driverTest.quit();
	}
}
