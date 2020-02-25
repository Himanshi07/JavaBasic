package practise;

import java.util.Scanner;

public class palindrome {
	
	public static void palin(int num)
	{
		int r;
		int t;
		int sum = 0;
		
		t=num;
		
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(t==sum)
		{
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println("Not palindrome");
		}
	}
	
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no.:");
		
		int num=s.nextInt();
		
		palin(num);
		
	}

}
