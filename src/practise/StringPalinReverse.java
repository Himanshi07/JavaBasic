package practise;

import java.util.Scanner;

public class StringPalinReverse {

	public static void reverse(String str)
	{
		int len= str.length();
		String r = "";
		
		for(int i=len-1;i>=0;i--)
		{
			r=r+str.charAt(i);
		}
		System.out.println(r);
		
		if(str.equalsIgnoreCase(r))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Nottt palindrome");
		}
	}
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter string");
		String str= s.next();
		
		reverse(str);
	}
}

