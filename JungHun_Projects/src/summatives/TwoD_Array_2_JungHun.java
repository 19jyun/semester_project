package summatives;

import java.util.Scanner;

public class TwoD_Array_2_JungHun {

	/**
	 * @author JungHun
	 * @Purpose create a 2D array
	 * @date December 1, 2017
	 */
	public static void main(String[] args)
	{

		System.out.println("Tictactoe game for two players!");
		
		String [][] tictactoe = new String[3][3];
		
		for(int q = 0; q<3; q++)
		{
			System.out.print("|");//making a bar between columns
			for(int w= 0; w<3; w++)
			{
				tictactoe[q][w] = " ";//keeping all spaces blank
				System.out.print(tictactoe[q][w] + "|");
			}
			System.out.println();
		}
		
		int i = 0;

		while(i <9)
		{
		Scanner keyboard = new Scanner(System.in);
		int row;
		int column;
		
		for(int r = 0; r<1; r++)
		{

		System.out.println("P1: row number? 1~3 ");//coordinate
		row = keyboard.nextInt();
		for(int t=0; t<1;t++)
		{
			if(row>3||row<1)
			{t--;//execute loop again and check
				System.out.println("out of bounds, please type again");
				row = keyboard.nextInt();}//if row is out of bounds, input again
		}
		
		System.out.println("P1: column number? 1~3");
		column = keyboard.nextInt();
		for(int t=0; t<1;t++)
		{
			if(column>3||column<1)
			{
				t--;//execute loop again and check
				System.out.println("out of bounds, please type again");
				column = keyboard.nextInt();}//if column is out of bounds, input again
		}
		
	
		if(tictactoe[row-1][column-1] == "O" ||tictactoe[row-1][column-1] == "X")//if values are already inputed, run for loop again or if user inputs a value for row and column that isnt 1 2 3, execute again
		{
		System.out.println("Unavailable. Please choose another coordinate that has not been chosen or is available");
		r--;//makes r decrease by 1, causing the for loop to run again
		}
		else
		{
		tictactoe[row-1][column-1] = "O";//at this coordinate put o
		}
		}
		
		for(int q = 0; q<3; q++) //print the array
		{
			System.out.print("|");
			for(int w= 0; w<3; w++)
			{
				System.out.print(tictactoe[q][w] + "|");
			}
			System.out.println();
		}
		
		if(tictactoe[0][0]=="O" && tictactoe[1][1]=="O" && tictactoe[2][2]=="O")//O winning scenarios //diagonal win, finish game
		{
			System.out.println("Player 1 Wins!");
			break;
		}
		if(tictactoe[0][2]=="O" && tictactoe[1][1]=="O" && tictactoe[2][0]=="O")//diagonal win, finish game
		{
			System.out.println("Player 1 Wins!");
			break;
		}
		if(tictactoe[0][0]=="O" && tictactoe[0][1]=="O" && tictactoe[0][2]=="O")//horizontal win, finish game
		{
			System.out.println("Player 1 Wins!");
			break;
		}
		if(tictactoe[1][0]=="O" && tictactoe[1][1]=="O" && tictactoe[1][2]=="O")//horizontal win, finish game
		{
			System.out.println("Player 1 Wins!");
			break;
		}
		if(tictactoe[2][0]=="O" && tictactoe[2][1]=="O" && tictactoe[2][2]=="O")//horizontal win, finish game
		{
			System.out.println("Player 1 Wins!");
			break;
		}
		if(tictactoe[0][0]=="O" && tictactoe[1][0]=="O" && tictactoe[2][0]=="O")//vertical win, finish game
		{
			System.out.println("Player 1 Wins!");
			break;
		}
		if(tictactoe[0][1]=="O" && tictactoe[1][1]=="O" && tictactoe[2][1]=="O")//vertical win, finish game
		{
			System.out.println("Player 1 Wins!");
			break;
		}
		if(tictactoe[0][2]=="O" && tictactoe[1][2]=="O" && tictactoe[2][2]=="O")//vertical win, finish game
		{
			System.out.println("Player 1 Wins!");
			break;
		}
		
		i++; //1 move has been executed
		if(i ==9)
		{
			System.out.println("The two players draw!");
			break;
		}//break for loop if 9 moves has been played and there are still no winner
		//This is set here because player 1 will ALWAYS play the last move if game doesn't have a winner
		
		System.out.println();
		
		for(int r = 0; r<1; r++)
		{
		
		System.out.println("P2: row number? 1~3");
		row = keyboard.nextInt();
		for(int t=0; t<1;t++)
		{
			if(row>3||row<1)
			{t--;//execute loop again and check
			System.out.println("out of bounds, please type again");
			row = keyboard.nextInt();
			}//if row is out of bounds, input again
		}
		
		System.out.println("P2: column number? 1~3");
		column = keyboard.nextInt();
		for(int t=0; t<1;t++)
		{
			if(column>3||column<1)
			{
				t--;//execute loop again and check
				System.out.println("out of bounds, please type again");
				column = keyboard.nextInt();
				}//if column is out of bounds, input again
		}
		
		
		if(tictactoe[row-1][column-1] == "O" || tictactoe[row-1][column-1] == "X")//if values are already inputed, run for loop again
		{
		System.out.println("Unavailable. Please choose another coordinate that has not been chosen");
		r--;//makes r decrease by 1, causing the for loop to run again
		}
		else
		{
		tictactoe[row-1][column-1] = "X";//at this coordinate put x
		}
		}
		
		for(int q = 0; q<3; q++) //print array
		{
			System.out.print("|");
			for(int w= 0; w<3; w++)
			{
				System.out.print(tictactoe[q][w] + "|");
			}
			System.out.println();
		}
		
		
		if(tictactoe[0][0]=="X" && tictactoe[1][1]=="X" && tictactoe[2][2]=="X")//X winning scenarios //diagonal win, finish game
		{
			System.out.println("Player 2 Wins!");
			break;
		}
		if(tictactoe[0][2]=="X" && tictactoe[1][1]=="X" && tictactoe[2][0]=="X")//diagonal win, finish game
		{
			System.out.println("Player 2 Wins!");
			break;
		}
		if(tictactoe[0][0]=="X" && tictactoe[0][1]=="X" && tictactoe[0][2]=="X")//horizontal win, finish game
		{
			System.out.println("Player 2 Wins!");
			break;
		}
		if(tictactoe[1][0]=="X" && tictactoe[1][1]=="X" && tictactoe[1][2]=="X")//horizontal win, finish game
		{
			System.out.println("Player 2 Wins!");
			break;
		}
		if(tictactoe[2][0]=="X" && tictactoe[2][1]=="X" && tictactoe[2][2]=="X")//horizontal win, finish game
		{
			System.out.println("Player 2 Wins!");
			break;
		}
		if(tictactoe[0][0]=="X" && tictactoe[1][0]=="X" && tictactoe[2][0]=="X")//vertical win, finish game
		{
			System.out.println("Player 2 Wins!");
			break;
		}
		if(tictactoe[0][1]=="X" && tictactoe[1][1]=="X" && tictactoe[2][1]=="X")//vertical win, finish game
		{
			System.out.println("Player 2 Wins!");
			break;
		}
		if(tictactoe[0][2]=="X" && tictactoe[1][2]=="X" && tictactoe[2][2]=="X")//vertical win, finish game
		{
			System.out.println("Player 2 Wins!");
			break;
		}
		i++; //1 move has been executed

		}

	}

}
