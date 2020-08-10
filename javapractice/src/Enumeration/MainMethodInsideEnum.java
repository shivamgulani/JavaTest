package Enumeration;

public enum MainMethodInsideEnum {

	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY;
	
	 MainMethodInsideEnum()
	{
	 System.out.println("Enum Constructor");
	}
	
	public static void main(String args)
	{
		System.out.println("inside main");
		
	}
	
	public static void enumMEthod()
	{
		System.out.println("enumMEthod");
	}
	
}
