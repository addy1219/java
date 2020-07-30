package test1;

import java.util.*;

public class Polynomial //Q.10
{
	List<Term> l = new ArrayList<Term>();
	public List<Term> setTerm()
	{
		
		int counter = 0;
		Scanner sc = new Scanner(System.in);
			int coeff = sc.nextInt();
			int expo = sc.nextInt();
			if(expo < 0)
				System.out.println("Invalid exponent!");
			else if(l.size() > 4)
				System.out.println("Defined array size exceeding!");
			else if(l.size() == 0)
				l.add(new Term(coeff,expo));
			else
			{
				for(int i = 0 ; i < l.size() ; i++)
				{
					Term tm = l.get(i);
					if(tm.getExponent() == expo)
						counter++;
					if(counter > 0)
					{
						System.out.println("Exponent already in use!");
						return l;
					}
				}
				l.add(new Term(coeff,expo));
			}
		return l;
	}
	public void sort(List<Term> l)
	{
		for(int i = 0 ; i < l.size() ; i++)
		{
			for(int j = i+1 ; j < l.size() ; j++)
			{
				Term t1 = l.get(i);
				Term t2 = l.get(j);
				if(t1.getExponent() > t2.getExponent())
				{
					int num1 = t1.getExponent();
					int num2 = t1.getCoefficient();
					t1.setExponent(t2.getExponent());
					t1.setCoefficient(t2.getCoefficient());
					t2.setExponent(num1);
					t2.setCoefficient(num2);
				}
			}
		}
	}
	public void disp(List<Term> l)
	{
		for(int i = 0 ; i < l.size() ; i++)
		{
			Term t = l.get(i);
			System.out.println(t);
		}
	}
}