package com.test;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
	WebDriver driver;
	
	 @FindAll(@FindBy(how=How.XPATH, using = "//a[@data-sc='B']")) private List<WebElement> Books;
	 @FindAll(@FindBy(how=How.XPATH, using = "//a[@data-sc='I']")) private List<WebElement> Images;
	 @FindAll(@FindBy(how=How.XPATH, using = "//a[@data-sc='V']")) private List<WebElement> Videos;
	 @FindAll(@FindBy(how=How.XPATH, using = "//a[@data-sc='N']")) private List<WebElement> News;

	public GoogleSearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verify_search_page_load()
	{
		if(Books.size()==1 && Images.size()==1 && Videos.size()==1 && News.size()==1)
			return true;
			else
				return false;
	}
	
	
	
	
	 
}
