package concepts;

import java.util.Scanner;

public class amstrong {
	
	
public static void amstro(int num)
{
	
	int r;
	int temp;
	int cube=0;
	
	temp=num;
	
	while(num>0)
	{
		r=num%10;
		num= num/10;
		cube= cube+(r*r*r);
	}
	
	if(temp==cube)
	{
		System.out.println("It is Amstrong no.");
	}
	
	else
	{
		System.out.println("Not amstrong");
	}
}
	
public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	System.out.println("Given Number:");
	int num= s.nextInt();
	amstro(num);
}

}
