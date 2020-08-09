package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeHomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(how=How.XPATH, using="//paper-button[@aria-label='Sign in']") WebElement user;
	@FindAll(@FindBy(how=How.TAG_NAME ,using ="yt-chip-cloud-chip-renderer")) List<WebElement> youtube_keyword;
	@FindBy(how=How.XPATH, using="//input[@type='email']") WebElement username;
	@FindBy(how=How.XPATH,using ="//span[text()='Next']//ancestor::div[2]") WebElement Next;
	
	
	
	
	public YoutubeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new  WebDriverWait(this.driver, 20);
	}
	
	public void click_on_signin()
	{
		user.click();
	}
	
	public void enter_username()
	{
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("shivamgulani@gmail.com");
		Next.click();
		
	}
	
	
	public void keyword_count()
	{
		System.out.println(youtube_keyword.size());
	}
	
	
	
	


}
