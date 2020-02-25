package concepts;

import java.util.Scanner;

public class RemoveJunk {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string:");
		String word = s.next();
		
		String withoutJunk = word.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("New text is: " + withoutJunk);

	}

}
