package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.YahooLoginPage;

public class TestYahooSignInPage {
	
public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		
		
		driverTest.get("https://login.yahoo.com/");
		
		YahooLoginPage yahooLoginPage = new YahooLoginPage(driverTest);
//		yahooLoginPage.sendUserNameId();
//		Thread.sleep(2000);
//		yahooLoginPage.clickonNextButton();
//		yahooLoginPage.sendLoginPassword();
//		yahooLoginPage.clickonLoginSubmitButton();
		
		
		//or
		yahooLoginPage.login();
		
	//	driverTest.close();
		
		

}
}