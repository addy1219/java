package test1;

public class Array_Element //Q.8
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		findElement(a,b);
	}
	public static void findElement(int a,int b)
	{
		int count = 0;
		int arr[] = {7,25,5,19,30};
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == a || arr[i] == b)
				count++;
		}
		if(count == 2)
			System.out.println("It's BINGO!");
		System.out.println("Not found!");
	}
}