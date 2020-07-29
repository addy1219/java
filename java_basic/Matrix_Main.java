package test1;

import java.util.Scanner;

public class Matrix_Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Matrix  m = new Matrix(3,3);
		       for(int i = 0 ; i < 3 ; i++)
		       {
		    	   for(int j = 0 ; j < 3 ; j++)
		    	   {
		    		   int val = sc.nextInt();
		    		   if(val > 0 )
		    			   m.setElement(i,j,val);
		    		   else
		    			   m.setElement(i,j,0);
		    	   }
		       }
		       m.transpose();
		       m.display();
		sc.close();
	}
}