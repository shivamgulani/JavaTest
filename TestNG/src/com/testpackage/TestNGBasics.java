package com.testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGBasics {

	@BeforeSuite
	public void before_suite()
	{
		System.out.println("Before Suite method called ");
	}
	
	@BeforeClass //would run only once after test me
	public void before_class()
	{
	System.out.println("Before class method called");	
	}
	
	@BeforeMethod //would run before every test method
	public void before_Method()
	{
		System.out.println("Before Method Called");
	}
	
	
	
	@BeforeTest//would run only once
	public void before_test()
	{
		System.out.println("Before Test Method Called");
	}
	
	@Test
	public void my_test()
	{
		System.out.println("Test Method Called");
	}
	
	@Test
	public void my_test2()
	{
		System.out.println("Test 2 Method Called");
	}
	
	@AfterMethod
	public void after_method()
	{
		System.out.println("after Method called");
	}
	
	@AfterTest
	public void after_test()
	{
		System.out.println("This is after test method");
	}
	
	@AfterClass
	public void after_class()
	{
		System.out.println("This is after class method called");
	}
	
	
	@AfterSuite
	public void after_Suite()
	{
		System.out.println("this is after suite method ");
	}
	
	
	
}
