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
import pomClasses.YahooMailPage;

public class TestNgClass_2 {
	
	
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
		public void VerifySentToMain() throws InterruptedException {
		 
		    YahooLoginPage yahooLoginPage = new YahooLoginPage(driverTest);
			yahooLoginPage.login();
		 
		    YahooMailPage yahooMailPage = new YahooMailPage(driverTest);
			
		 yahooMailPage.clickoninboxMail();
		 Thread.sleep(2000);
		 yahooMailPage.clickonCompose();
	     yahooMailPage.sendtosentMail();
	     yahooMailPage.sendsubject();
	     yahooMailPage.sendMessageBody();
    	 yahooMailPage.clickonSendButton();	
		}
		
		
		@AfterMethod
		public void BackPage() throws InterruptedException {
			
			YahooMailPage yahooMailPage = new YahooMailPage(driverTest);
			 Thread.sleep(2000);
			yahooMailPage.clickonProfileAcc();
	    	yahooMailPage.clickonSignOutButton();
			
		}
		
		@AfterClass
		public void closedbrowser() {
			driverTest.quit();
		}

}
