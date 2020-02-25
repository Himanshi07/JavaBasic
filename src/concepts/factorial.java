package concepts;

import java.util.Scanner;

public class factorial {

	//without recursive-- use for loop
	public static int facto(int num)
	{
		int fact=1;
		
		if(num==0)
			return 1;
		
		for(int i=1; i<=num;i++)
       {
	     fact= fact*i;
       }
		return fact;
	}
	
	//recursive-- calls itself
	public static int fac(int num)
	{
		if(num==0)
		{
			return 1;
		}
		
		else
		{
			return num *(fac(num-1));
			
		}
	}
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Number is:");
		int num = s.nextInt();
		
	    System.out.println(facto(num));
		System.out.println(fac(num));

		
	}
}
