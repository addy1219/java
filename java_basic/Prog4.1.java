package test1;

public class ModyRectangle //Q.4
{
	private double length = 1;
	private double breadth = 1;
	public ModyRectangle(double length, double breadth) 
	{
		this.length = length;
		this.breadth = breadth;
	}
	public double getLength() 
	{
		return length;
	}
	public void setLength(double length) 
	{
		if(length > 0.0 && length < 20.0)
			this.length = length;
	}
	public double getBreadth() 
	{
		return breadth;
	}
	public void setBreadth(double breadth) 
	{
		if(breadth > 0.0 && breadth < 20.0)
			this.breadth = breadth;
	}
	public double area()
	{
		return length*breadth;
	}
	public double perimeter()
	{
		return 2*(length+breadth);
	}
}