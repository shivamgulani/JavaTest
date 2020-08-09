package com.testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@DataProvider(name="user_pass")
	public Object[][] user_pass()
	{

	return new Object[] []{  {"username" ,"Password"}
							,{"shivam","Gulani"}};

	}	
	
	@DataProvider(name="pass")
	public Object[][] pass()
	{

	return new Object[] []{{"username" ,"Password","Learning"},{"shivam","Gulani","Learning"}};

	}
	
	

	@Test(dataProvider="user_pass")
	public  void login (String username ,String password)
	{
		System.out.println(username+" "+password);
	}
	
	
	@Test(dataProvider="pass")
	public  void check (String username ,String password,String c)
	{
		System.out.println(username+" "+password+" "+c);
	}
	
	
	
	
}


