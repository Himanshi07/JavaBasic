package practise;

import java.util.Scanner;

public class prime {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Number pls");
		int num= s.nextInt();
		
		if(num<=1)
		{
			System.out.println("Not prime");
		}
		
		for(int n=2; n<num; n++)
		{
			if(num%n==0)
			{
				System.out.println(n +"Not prime");
			}
		
		else {
			System.out.println(n + "Prime");
		}
	
		}
}
}
