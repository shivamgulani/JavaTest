package Basics;

public class NoMainMethod {

	static{
		System.out.println("Static Block");
	}
	
	
	//this block wont be called
	{
		System.out.println("Non Static Block");
	}
	
	//as per java 7 onwards we cannot run class without main method 
	//.prior to that if there was a static block the class would run 
	public static void main(String args[])
	{
		
		int a;
		System.out.println("Main method");
	}
}
