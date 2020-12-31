package programSet1;
import java.util.Scanner;

public class GuessNumGameTwoPlayerGame 
	{

	public static void main(String[] args) 
	{
		System.out.println("Two Player Game! One person choose a number, the next person guess the number!");
		System.out.println("Difficulty:");
		System.out.println("1. Easy");
		System.out.println("2. Medium");
		System.out.println("3. Hard");
		
		int n1;
		int x;
		int difficulty;
		int chances=0;
		
		Scanner keyboard = new Scanner(System.in);
		x = keyboard.nextInt();
		difficulty = keyboard.nextInt();
		
		if(difficulty == 1)
		{ 
			chances = 5;
			System.out.println("You have 5 chances! Good luck!");
		}
		if(difficulty == 2)
		{ 
			chances = 3;
			System.out.println("You have 3 chances! Good luck!");
		}
		if(difficulty == 3)
		{ 
			chances = 2;
			System.out.println("You have 2 chances! Good luck!");
	
		}
			
		for(int c=1; c<=chances; c++)
			{
				n1 = keyboard.nextInt();
				if(n1==x)
				{
					System.out.println("Correct!");
				}
				else if(n1>x)
				{
					System.out.println("High");
				}
				else if(n1<x)
				{
					System.out.println("Low");
				}
		}
			
		
		
	}
	}

	
