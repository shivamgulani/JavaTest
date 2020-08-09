package com.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GoogleHomePage {

	WebDriver driver;
	
	 @FindBy(xpath= "//input[@title='Search']") private WebElement Search;

	public GoogleHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	 public void search_google(String search_criteria)
	 {
		 Search.sendKeys(search_criteria);
	 }
	 
	 public void press_Enter()
	 {
		 Search.sendKeys(Keys.ENTER);
	 }
	 
}
