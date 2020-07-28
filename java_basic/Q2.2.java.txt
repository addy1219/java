package test1;

public class TestRectangle //Q.2
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(5.0,2.0);
		System.out.println("Length : "+r1.getLength()+" Breadth : "+r1.getBreadth()+" Area : "+r1.area());
		
		Rectangle r2 = new Rectangle(7.0,5.0);
		System.out.println("Length : "+r2.getLength()+" Breadth : "+r2.getBreadth()+" Area : "+r2.area());
		
		Rectangle r3 = new Rectangle(8.0,3.0);
		System.out.println("Length : "+r3.getLength()+" Breadth : "+r3.getBreadth()+" Area : "+r3.area());
		
		Rectangle r4 = new Rectangle(6.0,9.0);
		System.out.println("Length : "+r4.getLength()+" Breadth : "+r4.getBreadth()+" Area : "+r4.area());
		
		Rectangle r5 = new Rectangle(2.0,9.0);
		System.out.println("Length : "+r5.getLength()+" Breadth : "+r5.getBreadth()+" Area : "+r5.area());
	}
}