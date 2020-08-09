package com.testFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.GoogleHomePage;

public class GoogleHomeSearch {

	  
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
	public void search_functionality()
	{
		GoogleHomePage objHomePage=new GoogleHomePage(driver);
		objHomePage.search_google("Selenium");
		objHomePage.press_Enter();
		
	}
	
	@AfterMethod(groups="Google")
	public void clear_browser()
	{
		//driver.quit();
	}
	
	
	
}
