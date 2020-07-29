package test1;

import java.util.Scanner;

public class Polynomial //Q.10
{
	public Term[] setTerm()
	{
		Term[] t = new Term[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < t.length ; i++)
		{
			int coeff = sc.nextInt();
			int expo = sc.nextInt();
			t[i] = new Term(coeff,expo);
		}
		sc.close();
		return t;
	}
	public void sort(Term[] t)
	{
		for(int i = 0 ; i < t.length-1 ; i++)
		{
			for(int j = i+1 ; j < t.length-i ; i++)
			{
				if(t[j].getExponent() > t[j+1].getExponent())
				{
					int num1 = t[j].getExponent();
					int num2 = t[j+1].getExponent();
					int num3 = t[j].getExponent();
					num1 = num2;
					num2 = num3;
				}
			}
		}
	}
	public void disp(Term[] t)
	{
		for(int i = 0 ; i < t.length ; i++)
			System.out.println(t[i]);
	}
}