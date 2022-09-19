package Encapsulation;

public class class2 {

	public static void main(String [] args)
	{
		class1 cl= new class1();
		int height=cl.setHeight(25);
		int length=cl.setLength(12);
	    int width=cl.setWidth(15);
	    
	System.out.println("height "+cl.getHeight());
	System.out.println("lentgh "+cl.getLength());
	System.out.println("width "+cl.getWidth());
	}
}
