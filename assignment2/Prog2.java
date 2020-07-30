package test2;

public class Median { //Q.2
	static short i,j,count;
	public static void main(String[] args) {
		short[] s1 = {1,2,10};
		short[] s2 = {3,4,5,6,7,8,9,11};
		short[] s3 = new short[s1.length+s2.length];
		while(i < s1.length && j < s2.length) {
			if(s1[i] < s2[j])
				s3[count++] = s1[i++];
			else
				s3[count++] = s2[j++];
		}
		if(s1.length==s2.length)
			System.out.println("Median : "+(s3[(s3.length/2)]+s3[(s3.length/2-1)])/2);
		else
			System.out.println("Median : "+s3[s3.length/2]);
	}
}
/*
public class Median {
	static short i,j,count;
	public static void main(String[] args) {
		short[] s1 = {1,2,10};
		short[] s2 = {3,4,5,6,7,8,9,11};
		if(s1.length <= s2.length)
			check(s1,s2);
		else
			check(s2,s1);
	}
	public static void check(short[] s_min, short[] s_max) {
		short k = s_max.length-1;
		while(i < s_min.length) {
			if(s_min[i] < s_max[j]) {
				count++;
				i++;
			}
			else {
				if(s_min[i] > s_max[k]) {
					count++;
				    i++;
				}
				else
					k--;
			}
		}
		if(s_min.length==s_max.length) {
			int num = (s_min.length+s_max.length)/2;
			num = (num-1)/2;
			if(s_min[0] < s_max[0])
				System.out.println("Median is : "+s_max[num]);
			else
				System.out.println("Median is : "+s_min[num]);
		}
		else
			System.out.println("Median is : "+s_max[count]);
	}
}
*/