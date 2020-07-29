package test1;

import java.util.Scanner;

public class Even_list //Q.1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		check(sc.nextInt());
		sc.close();
	}
	public static void check(int n)
	{
		for(int i = 1 ; i <= n ; i++)
		{
			if(i%2 == 0)
				System.out.println(i);
		}
	}
}