package practise;

import java.util.Scanner;

public class armstrong {

	public static void armo(int num)
	{
		int r;
		int t;
		int cube=0;
		
		t=num;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube= cube+(r*r*r);
		}
		
		if(t==cube)
		{
			System.out.println("Armstrong no. it is");
		}
		else
		{
			System.out.println("Not armstrong no.");
		}
	}
	
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		
		armo(num);
	}
}
