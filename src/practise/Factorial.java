package practise;

import java.util.Scanner;

public class Factorial {

	public static int fact(int num)
	{
		int facts = 1;
	//non recursive-- using for loop
		if(num==0)
			return 1;
		
		for(int i=1;i<=num;i++)
		{
			facts=facts*i;
		}
		return facts;
	}
	
	public static int facto(int num)
	{
		//Recursive-- method calls itself	
	
		if(num==0)
		{
			return 1;
		}
		
		else
		{
			return num*facto(num-1);
		}
	}
	
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		
		System.out.println(fact(num));
		System.out.println(facto(num));
	}
}
