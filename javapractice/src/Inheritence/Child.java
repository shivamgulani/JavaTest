package Inheritence;

public class Child extends PArent {

	public static void main(String args[])
	{
		GrandParent a= new PArent();
		PArent c= (PArent) a;
		Child b=new Child();
		
		a.display();
		a.grandParentdisplay();
		
		
		
	}
}
