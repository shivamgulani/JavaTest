package CodeShivam;

import org.junit.Test;
import org.junit.Assert; 

public class JUnitClass {
	
	
	@Test
	public void setUp()
	{
		String str="This is my first JUnit program";
		System.out.println("This is my first JUnit program");
		Assert.assertEquals("This is my first JUnit program", str);
	}
	
	@Test
	public void test1()
	{
		String str="This is my first JUnit program";
		System.out.println("This is my first JUnit program");
		Assert.assertEquals("This is my first JUnit program", str);
	}
	
	@Test
	public void test2()
	{
		String str="This is my first JUit program";
		System.out.println("This is my first JUnit program");
		Assert.assertEquals("This is my first JUnit program", str);
	}
	
	@Test
	public void test3()
	{
		String str="This is my first JUnit program";
		System.out.println("This is my first JUnit program");
		Assert.assertEquals("This is my first JUnit program", str);
	}

}
