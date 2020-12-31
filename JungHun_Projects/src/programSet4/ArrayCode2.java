package programSet4;

import java.util.Scanner;

public class ArrayCode2 {
	
	/**
	 * @author 19jyun
	 * @date sep 2017
	 * @purpose learn to code arrays
	 */

	public static void main(String[] args)
	{
		
		String [] wordArray = new String[4];
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type in 4 words");
	
		for (int i=0; i<wordArray.length; i++)
		{
			wordArray[i] = keyboard.next();
			
		for (i = 0; i< wordArray.length; i++)	
		{
			System.out.print(wordArray[i] + " ");
		}
		
		
		System.out.println();
		System.out.println(wordArray[i] + " ");
		}
	}
}