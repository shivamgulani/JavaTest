package javapractice;

public class ImplemtationSameMethodSignature implements SameMethodSignature,SameMethodSignature2
{

	@Override
	public void show() {
		System.out.println("hey");
		
	}
	public static void main()
	{
		ImplemtationSameMethodSignature o1=new ImplemtationSameMethodSignature();
		o1.show();

		
	}

}
