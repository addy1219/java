package test1;

import java.util.List;
import java.util.Scanner;

public class Poly_Main 
{
	public static void main(String[] args)
	{
		Polynomial p = new Polynomial();
		List<Term> l = null;
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("1.setTerm()\n2.sort()\n3.disp()\n4.exit()\n");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			   l = p.setTerm();
			   break;
			case 2:
	           p.sort(l);
	           p.disp(l);
	           break;
			case 3:
	           p.disp(l);
	           break;
			case 4:
				System.exit(0);
			}
		}
	}
}