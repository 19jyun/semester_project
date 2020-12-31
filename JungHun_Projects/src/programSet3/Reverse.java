package programSet3;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{

		String name;
		int i;
		
		Scanner keyboard = new Scanner(System.in);
		name = keyboard.next();
		
		char[] reverse = name.toCharArray();
		
		for (i = reverse.length-1; i>=0; i--)
		{
			System.out.print(reverse[i]);
		}
		

	}

}
