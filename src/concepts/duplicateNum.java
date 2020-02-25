package concepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class duplicateNum {
	
	public static void main(String args[])
	{
	
	int[] a= {3,2,5,3,2,1,3,2,3};
			
	
	/* for(int i=0; i<a.length-1; i++)
   {
	   for(int j= i+1; j<a.length; j++)
	   {
		   if(a[i]==a[j] && (i!=j))
		   {
			   System.out.println(a[j] + " ");
		   }
	   }
   }

		
	Set<Integer> s = new HashSet<>();
	
	for(int num:a)
	{
		
		if(s.add(num)==false)
		{
			System.out.println(num+" ");
		}
	}*/
	
	Map<Integer,Integer> m = new HashMap<>();
	for(int num:a)
	{
		Integer count = m.get(num);
		if(count==null)
		{
			m.put(num, 1);
		}
		else
		{
		 count= count+1;
		 m.put(num, count);
		}
	}
		System.out.println("Duplicate numbers are:" );
		Set<Map.Entry<Integer, Integer>> s= m.entrySet();
		
		for(Map.Entry<Integer, Integer> es:s)
		{
		if(es.getValue() >1)
		 {
			System.out.println(es.getKey()+ " ");
		 }
	    }
      }
	}
	
