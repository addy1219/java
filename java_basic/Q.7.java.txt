package test1;

public class Sum_Series //Q.7
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		findSum(a,b);
	}
	public static void findSum(int a,int b)
	{
		int tot = 0;
		System.out.print(a+" "+b+" ");
		for(int i = 0 ; i < 13 ; i++)
		{
			tot = a + b;
			a = b;
			b = tot;
			System.out.print(tot+" ");
		}
	}
}