package com.testFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.YoutubeHomePage;

public class YoutubeUserSignIn  implements ITestListener{
	
	WebDriver driver;
	@BeforeMethod(groups="Youtube")
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\development\\jars\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}
	
	@Test(groups="Youtube")
	public void Check_user_signed_in()
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		Wait fluent_wait=new FluentWait<WebDriver>(driver)
				.withTimeout(50,TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(Exception.class);
		
		YoutubeHomePage objYoutube=new YoutubeHomePage(driver);
		
		objYoutube.click_on_signin();
		
	}
	
	@AfterMethod(groups="Youtube")
	public void tear_down()
	{
		//driver.quit();
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//
		System.out.println("PASSED through ITESTLISTener");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("FAILED through ITESTLISTener");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test case started");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test case Finish");
	}

}
