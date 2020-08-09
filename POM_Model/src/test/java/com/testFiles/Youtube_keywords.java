package com.testFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.YoutubeHomePage;

public class Youtube_keywords {

	WebDriver driver;
	@BeforeMethod(groups="Youtube")
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\development\\jars\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}
	
	@Test(groups="Youtube")
	public void get_keywords_txt()
	{
		
		
		
		YoutubeHomePage objYoutube=new YoutubeHomePage(driver);
		
		objYoutube.click_on_signin();
		objYoutube.enter_username();
		objYoutube.keyword_count();;
		
	}
	
	@AfterMethod(groups="Youtube")
	public void tear_down()
	{
		//driver.quit();
	}
}
