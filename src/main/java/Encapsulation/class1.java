package Encapsulation;
//encapsulation is the concept of hiding the data by wrapping up all the data into the single unit
//we can hide the data by providing private access specifier and by creating the public setter and getter method.

public class class1 {
	
	private int length;
	private int breadth;
	private int height;
	
public void setDimension(int l, int b, int h)
{
	System.out.println("Box created with Dimension"+l+" "+b+" "+h+" ");
}

public int setLength(int l)
{
	length=l;
	return length;
}
public int setWidth(int b)
{
	breadth=b;
	return breadth;
}
public int setHeight(int l)
{
	height=l;
	return height;
}

public int getHeight()
{
	return height;
	
}
public int getWidth()
{
	return breadth;
	
}
public int getLength()
{
	return length;
	
}

	
	
	
	
}
