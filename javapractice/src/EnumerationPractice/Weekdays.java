package EnumerationPractice;

 enum Weekdays_enum implements a {

	            Monday(1),Tuesday(2),Wednesday(3),Thursday(4),Friday(5);
	            
	            
	            private int day_no;
	            public int x;
	            
	            Weekdays_enum(int day_no)
	            {
	            	this.day_no=day_no;
	            }
	            
	            public int  get_weekday_no()
	            {
	            	return this.day_no;
	            }
	            
	            
	          
}
 
 interface a{
	 static public void show()
	 {
		 System.out.println("enum interface");
	 }
 }
 
 
 //enum can not be instatiented 
 //enum cannot extend other classes as it alredays extends the enum class 
 //enum can not  have abstract methods
 //enum can have constructors 
 //enum can have public and private data memebers 
 
 
 

public class Weekdays 
{
	
	
	
	public static void main(String args[])
	{
	
		Weekdays_enum [] weekdays=Weekdays_enum.values();
		
		for(Weekdays_enum weekday : weekdays)
		{
			System.out.println(weekday.name()+" --- "+weekday.get_weekday_no());
		}
		
		
	}
}
