package concepts;

public class palindrome {

		public static void isPalin(int num)
	{
		System.out.println("Given number is:" + num);
		 
		 int r=0;
		 int sum=0;
		 int temp;
		
		temp=num;
		
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
		}
		
		if(temp==sum)
		{
			System.out.println("No. is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
	
	
public static void main(String args[])
{
	isPalin(121);
	isPalin(78987);
	isPalin(127898720);
}

}
