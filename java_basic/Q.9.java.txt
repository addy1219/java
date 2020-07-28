package test1;

public class Array_Zero //Q.9
{
	public static void main(String[] args)
	{
		int arr[] = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		compute(arr,0,arr[0]);
	}
	public static void compute(int[] arr,int sum,int min)
	{
		for(int i = 0 ; i < 15 ; i++)
		{
			sum = sum + arr[i];
			if(arr[i] <= min)
				min = arr[i];
		}
		arr[15] = sum;
		System.out.println(arr[15]);
		arr[16] = sum/17;
		System.out.println("Average : "+arr[16]);
		arr[17] = min;
		System.out.println("Minimum : "+arr[17]);
	}
}