package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.YahooLoginPage;
import pomClasses.YahooMailPage;
import pomClasses.YahooSearchPage;

public class TestSentToMain {
	
	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		
		
		driverTest.get("https://login.yahoo.com/");
		YahooLoginPage yahooLoginPage = new YahooLoginPage(driverTest);
		yahooLoginPage.login();
		
		YahooSearchPage yahooSearchPage = new YahooSearchPage(driverTest);
		yahooSearchPage.clickonMailButton();
		
		YahooMailPage yahooMailPage = new YahooMailPage(driverTest);
		yahooMailPage.clickonCompose();
		yahooMailPage.sendtosentMail();
		yahooMailPage.sendsubject();
		yahooMailPage.sendMessageBody();
		yahooMailPage.clickonSendButton();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	

}
