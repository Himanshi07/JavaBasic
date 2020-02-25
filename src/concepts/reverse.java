package concepts;

import java.util.Scanner;

public class reverse {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter string");
		String name= s.next();
		
		int len= name.length();
		String rev="";
		
		for(int i=len-1; i>=0; i--)
		{
			rev= rev +name.charAt(i);
		}
		System.out.println(rev);

		if(name.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		}
}
