package summatives;

import java.util.Scanner;

public class SA_Kiosk {

	/**
	*@author 19jyun
	*@date September 26
	*@purpose summative project
	*/

	public static void main(String[] args) 
	{

		System.out.println("Menu: Brownie (SB), Pizza (NP), Lemonade (NL), Iced tea(ST), Pasta (SP)");
		
		String a;
		int b;
		int array [] = new int [100];
		int i = array.length;
		
		Scanner keyboard = new Scanner(System.in);
		
	
		
		
		for(i = 0; i < 100; i++)
		{
			
			System.out.println("Please input item code and amount.");
			a = keyboard.next();
			b = keyboard.nextInt();

			if(a.charAt(0) == 'S')
			{
				array[i] = 80*b;
			}
			else if(a.charAt(0) == 'N')
			{
				array[i] = 50*b;
				
			}
			else if(a.charAt(0) == 'Q')
			{
				i = 100;
			}
			else
			{
				System.out.println("Unvalied Item");
			}
	
		}
		
		System.out.println();
		System.out.println("Your total amount to pay is Rs " + array[i] + ".");

		
		
		
	}

}
