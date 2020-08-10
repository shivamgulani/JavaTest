package Enumeration;

enum Color
{
	red,green,yellow;
	//Enums can have only same data type we cannot club string with integer
	//red,gree,yellow,1 is invalid
}

/* internally above enum Color is converted to
class Color
{
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
}*/


public class EnumExample {

	
	public static void main(String args[])
	{
	Color c1=Color.red;
	System.out.println(c1);

	}
	}
