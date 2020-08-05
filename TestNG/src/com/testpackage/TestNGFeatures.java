package com.testpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGFeatures {

	
	// suppose test1 is login , test2 is homepage test3 is search 
	//now if login fails we dont want to make other test cases run 
	//so we will depends on 
	//if we use prioirty it wont consider it as there is depends on used
	
	@Test(priority=2,invocationCount = 10)
	public void test1()
	{
		System.out.println("test 1");
		Assert.assertFalse(1==1);
		System.out.println("hey");
	}
	

	@Test(priority=1,dependsOnMethods="test1")
	public void test2()
	{
		System.out.println("test 2");
	}
	

	@Test(priority=3,dependsOnMethods="test1")
	public void test3()
	{
		System.out.println("test 3");
	}
}
