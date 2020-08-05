package com.testpackage;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {

	
	WebDriver driver;
	
	@BeforeMethod(groups="Google Mail Link")
	public void set_Up()
	{
		String driver_location="F:\\development\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_location);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test(priority=1,groups="Google Title")
	public void getGoogleTitle()
	{
		
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	
	@Test(priority=3,groups="Google logo")
	public void googleLogoTest()
	{
		boolean b=driver.findElement(By.xpath("//img[@title='Wear a Mask. Save Lives: Help Stop Coronavirus']")).isDisplayed();
		System.out.println(b); 
	}
	
	
	@Test(priority=2,groups="Google Mail Link")
	public void googleMailLink()
	{
		boolean b=driver.findElement(By.xpath("//a[@data-pid='23']")).isDisplayed();
		System.out.println(b); 
	}
	
	@Test(priority=6,groups="Test")
	public void test1()
	{
	
		System.out.println("Test1"); 
	}
	
	@Test(priority=5,groups="Test")
	public void test2()
	{
	
		System.out.println("Test2"); 
	}
	
	@Test(priority=4,groups="Test")
	public void test3()
	{
	
		System.out.println("Test3"); 
	}
	
	@AfterMethod(groups="Google Mail Link")
	public void tearDown()
	{
		driver.quit();
	}
}
