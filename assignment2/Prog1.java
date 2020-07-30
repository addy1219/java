package test2;

public class ArraySumCheck //Q.1
{
	static int num = 5;
	public static void main(String[] args) {
		sorted();
		System.out.println("----");
		unsorted();
	}
	public static void sorted() { //sorted array
		int i = 0, count = 0;
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		while(true) {
			if(count >= a.length-1)
				break;
			int x = a[i];
			int y = a[i+1+count];
			if(x+y==num)
				System.out.println(x+" "+y);
			if(x >= num || y >= num || x+y > num) {
				i = 0;
				count++;
			}
			else
			  i++;
		}
	}
	public static void unsorted() { //unsorted array
		int i = 0, count = 0;
		int[] a = {1,9,2,4,3,10,7,6,5};
		while(true) {
			if(count >= a.length-1)
				break;
			int x = a[i];
			int y = a[i+1+count];
			if(x+y==num)
				System.out.println(x+" "+y);
			if(i+1+count == a.length-1) {
				i = 0;
				count++;
			}
			else
			  i++;
		}
	}
}