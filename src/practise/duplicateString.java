package practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class duplicateString {

	public static void duplicate(String str)
	{
		//split
		String[] words = str.split(" ");
		
		//creat hashmap
		Map<String,Integer> m = new HashMap<String, Integer>();
		
		//check each word in array
		for(String word: words)
		{
			//if word is present
			if(m.containsKey(word))
			{
				m.put(word.toLowerCase(), m.get(word)+1);
			}
			else
			{
				m.put(word, 1);
			}
		}
		
		//extract all keys of map --m
		Set<String> s = m.keySet();
		
		//loop through all the words in map
		for(String text:s )
		{
			if(m.get(text)>1)
			{
				System.out.println(text + " "+ m.get(text));
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter string:");
		String str= s.nextLine().toLowerCase();
		
		duplicate(str);
	}

}
