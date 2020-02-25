package concepts;

import java.util.Scanner;

public class newPrime {
	
	static int temp=0;
	
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a value:");
		
		int test= s.nextInt();
		
		for(int n=2; n<=test; n++)
		{
			for(int i=2 ; i<n; i++ )
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		
		if(temp==0)
		{
			System.out.println(n);
		}
		else
		{
			temp=0;
		}
	
	
		}
	}
}


