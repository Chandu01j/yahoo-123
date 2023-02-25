package test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.YahooSearchPage;

public class TestYahooSearchTab {
	
	
public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		
		
		driverTest.get("https://in.search.yahoo.com/");
		
		YahooSearchPage yahooSearchPage = new YahooSearchPage(driverTest);
		
		yahooSearchPage.sendyahooSearchtab();
		yahooSearchPage.clickonSearchButton();
	//	yahooSearchPage.clickonSearchImage();
		yahooSearchPage.clickonSearchvideo();
		yahooSearchPage.clickonFirstvideoPlay();
	
}
}