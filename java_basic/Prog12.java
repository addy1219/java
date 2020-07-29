package test1;

public class Complex //Q.12
{
	private int a;
	private int b;
	public Complex(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	public static Complex addition(Complex c1,Complex c2)
	{
		Complex c = new Complex(0,0);
		c.a = c1.a+c2.a;
		c.b = c1.b+c2.b;
		return c;
	}
	public static Complex substraction(Complex c1,Complex c2)
	{
		Complex c = new Complex(0,0);
		c.a = c1.a-c2.a;
		c.b = c1.b-c2.b;
		return c;
	}
	public static void display(Complex c1,Complex c2,Complex add,Complex sub)
	{
		System.out.println("Sum of: "+ c1.a+"i & "+ c2.a +"i is :"+add+"i");
		System.out.println("Diff of: "+ c1.b+"i & "+ c2.b +"i is :"+sub+"i");
	}
	@Override
	public String toString()
	{
		return a+" "+b+" ";
	}
	public static void main(String[] args)
	{
		Complex c1 = new Complex(8,5);
		Complex c2 = new Complex(2,4);
		   Complex add = addition(c1,c2);
		   Complex sub = substraction(c1,c2);
		                display(c1,c2,add,sub);
	}
}