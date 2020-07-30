package test1;

public class ModyTestRectangle //Q.4
{
	public static void main(String[] args)
	{
		ModyRectangle r1 = new ModyRectangle(5.0,2.0);
		System.out.println("Length : "+r1.getLength()+" Breadth : "+r1.getBreadth()+" Area : "+r1.area()+" Perimeter : "+r1.perimeter());
		
		ModyRectangle r2 = new ModyRectangle(7.0,5.0);
		System.out.println("Length : "+r2.getLength()+" Breadth : "+r2.getBreadth()+" Area : "+r2.area()+" Perimeter : "+r2.perimeter());
		
		ModyRectangle r3 = new ModyRectangle(8.0,3.0);
		System.out.println("Length : "+r3.getLength()+" Breadth : "+r3.getBreadth()+" Area : "+r3.area()+" Perimeter : "+r3.perimeter());
		
		ModyRectangle r4 = new ModyRectangle(6.0,9.0);
		System.out.println("Length : "+r4.getLength()+" Breadth : "+r4.getBreadth()+" Area : "+r4.area()+" Perimeter : "+r4.perimeter());
		
		ModyRectangle r5 = new ModyRectangle(2.0,9.0);
		System.out.println("Length : "+r5.getLength()+" Breadth : "+r5.getBreadth()+" Area : "+r5.area()+" Perimeter : "+r5.perimeter());
	}
}