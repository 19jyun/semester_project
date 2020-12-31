package programSet3;

import java.util.Scanner;

public class GameOfNim {

	public static void main(String[] args)
	{
		int p;//player input number
		int q;//smart move by pc
		
		int r = 10 + (int)(Math.random()*90);//random starting number
		
		int z = (int)(Math.random()*r/2);//stupid pc takes out marbles
		
		int o = (int)(Math.random()*2);//who goes first
		
		int s = (int)(Math.random()*2);//smartness of the computer
		
		System.out.println(r + " is the number!!");
		
		System.out.println("You can take out minimum 1 marble, maximum half the stack of marbles!");
		
		if(o == 1 && s == 1)//player goes first, computer is smart
		{
			System.out.println("Player goes first against a smart computer!");
			
			for(int i = 0; i<r; i++)
			{
				Scanner keyboard = new Scanner(System.in);
				p = keyboard.nextInt();
				
				r = r - p;
				if(r <= 1)
				{
					System.out.println("You Win!");
				}
				System.out.println(r);
				if(r == 3 || r ==  7 || r == 15 || r == 31 || r ==  63)
				{
					q = 1 + (int)(Math.random()*(r/2)-1);
					r = r - q;
				}
				else if(2<=r && r<=6)
				{
					r = 3;
				}
				else if(7<=r && r<=14)
				{
					r = 7;
				}
				else if(15<=r && r<=30)
				{
					r = 15;
				}
				else if(31<=r && r<=62)
				{
					r = 31;
				}
				else if(63<=r && r<=100)
				{
					r = 64;
				}
					
				if(r <= 1)
				{
					System.out.println("You Lose!");
				}
				System.out.println(r);
			}
			
		}
		else if(o == 1 && s == 0)//player goes first, computer is stupid
		{
			System.out.println("Player goes first against a stupid computer!");
			
			for(int i = 0; i<r; i++)
			{
				Scanner keyboard = new Scanner(System.in);
				p = keyboard.nextInt();
				
				r = r - p;
				if(r <= 1)
				{
					System.out.println("You Win!");
				}
				System.out.println(r);
				r = r - z;
				if(r <= 1)
				{
					System.out.println("You Lose!");
				}
				System.out.println(r);
			}
			
		}
		else if(o == 0 && s == 1)//computer goes first, computer is smart
		{
			System.out.println("Smart computer goes first!");
			
			for(int i = 0; i<r; i++)
			{
				if(r == 3 || r ==  7 || r == 15 || r == 31 || r ==  63)
				{
					q = 1 + (int)(Math.random()*(r/2)-1);
					r = r - q;
				}
				else if(2<=r && r<=6)
				{
					r = 3;
				}
				else if(7<=r && r<=14)
				{
					r = 7;
				}
				else if(15<=r && r<=30)
				{
					r = 15;
				}
				else if(31<=r && r<=62)
				{
					r = 31;
				}
				else if(63<=r && r<=100)
				{
					r = 64;
				}
				if(r <= 1)
				{
					System.out.println("You Lose!");
				}
				
				System.out.println(r);
				
				Scanner keyboard = new Scanner(System.in);
				p = keyboard.nextInt();
				
				r = r - p;
				if(r <= 1)
				{
					System.out.println("You Win!");
				}
				
				System.out.println(r);
			}
		}
		else if(o == 0 && s == 0)//computer goes first, computer is stupid
		{
			System.out.println("Stupid computer goes first!");
			
			for(int i = 0; i<r; i++)
			{
				r = r - z;
				if(r <= 1)
				{
					System.out.println("You Lose!");
				}
				
				System.out.println(r);
				
				Scanner keyboard = new Scanner(System.in);
				p = keyboard.nextInt();
				
				r = r - p;
				if(r <= 1)
				{
					System.out.println("You Win!");
				}
				
				System.out.println(r);
			}
		}

	}

}
