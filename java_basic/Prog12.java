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
	public static int addition(Complex c)
	{
		int co = c.a+c.b;
		return co;
	}
	public static int substraction(Complex c)
	{
		int co = c.a-c.b;
		return co;
	}
	public static void display(Complex c,int add,int sub)
	{
		System.out.println("Sum of: "+ c.a +"i & "+ c.b +"i is :"+add+"+i");
		System.out.println("Diff of: "+ c.a+"i & "+ c.b +"i is :"+sub+"+i");
	}
	@Override
	public String toString()
	{
		return a+" "+b+" ";
	}
	public static void main(String[] args)
	{
		Complex c = new Complex(2,1);
		   int add = addition(c);
		   int sub = substraction(c);
		                display(c,add,sub);
	}
}