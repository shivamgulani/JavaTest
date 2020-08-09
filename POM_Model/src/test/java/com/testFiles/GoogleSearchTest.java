package com.testFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.GoogleHomePage;
import com.test.GoogleSearchPage;

public class GoogleSearchTest {

	WebDriver driver;
	@BeforeMethod(groups="Google")
	 public void setUP()
	 {
		 System.setProperty("webdriver.chrome.driver","F:\\development\\jars\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com"); 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	 
	@Test(groups="Google")
	public void search_Verify_functionality()
	{
		GoogleHomePage objHomePage=new GoogleHomePage(driver);
		GoogleSearchPage objSearchPage=new GoogleSearchPage(driver);
		
		
		
		objHomePage.search_google("Selenium");
		objHomePage.press_Enter();
		Assert.assertEquals(true,objSearchPage.verify_search_page_load());
	}
	
	@AfterMethod(groups="Google")
	public void clear_browser()
	{
		//driver.quit();
	}
	
}
