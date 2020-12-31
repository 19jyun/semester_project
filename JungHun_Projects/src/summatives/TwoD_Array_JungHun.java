package summatives;

import java.util.Scanner;

public class TwoD_Array_JungHun {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		System.out.println("Following are the possible seats and their price.");
		
		int [][] seats = new int[9][10];
		
		for(int i = 0; i<3; i++) //fill 10 up to row 3
		{
			for(int j = 0; j<10; j++)
			{
				seats[i][j] = 10;
			}
		}
		
		for(int i = 3; i<6; i++) //fill 10 for row 4 5 6 column 1 2
		{
			for(int j = 0; j<2; j++)
			{
				seats[i][j] = 10;
			}
		}
		
		for(int i = 3; i<6; i++) //fill 10 up to row 4 5 6 column 9 10
		{
			for(int j = 8; j<10; j++)
			{
				seats[i][j] = 10;
			}
		}
		
		for(int i = 3; i<6; i++) //fill 20 up to row 4 5 6 column 3 4 5 6 7 8
		{
			for(int j = 2; j<8; j++)
			{
				seats[i][j] = 20;
			}
		}
		
		seats[6][0] = 20; //row 7
		seats[6][1] = 20;
		seats[6][2] = 30;
		seats[6][3] = 30;
		seats[6][4] = 40;
		seats[6][5] = 40;
		seats[6][6] = 30;
		seats[6][7] = 30;
		seats[6][8] = 20;
		seats[6][9] = 20;
		
		seats[7][0] = 20; //row 8
		seats[7][1] = 30;
		seats[7][2] = 30;
		seats[7][3] = 40;
		seats[7][4] = 50;
		seats[7][5] = 50;
		seats[7][6] = 40;
		seats[7][7] = 30;
		seats[7][8] = 30;
		seats[7][9] = 20;
		
		seats[8][0] = 30; //row 9
		seats[8][1] = 40;
		seats[8][2] = 50;
		seats[8][3] = 50;
		seats[8][4] = 50;
		seats[8][5] = 50;
		seats[8][6] = 50;
		seats[8][7] = 50;
		seats[8][8] = 40;
		seats[8][9] = 30;
		
		for(int i = 0; i<9; i++) //fill 20 up to row 4 5 6 column 3 4 5 6 7 8
		{
			for(int j = 0; j<10; j++)
			{
				System.out.print(seats[i][j] + "\t");
			}
			System.out.println();
		}
		
		for(int i=0; i<1000000; i++)
		{
		
		System.out.println("If you want to choose a seat, type 'seat'. If you want to choose a price, type 'price'. If you do not wish to purchase anything, type 'finish'.");
		
		Scanner keyboard = new Scanner(System.in);
		String selection;
		selection = keyboard.next();
		
		System.out.println("How many consecutive numbers of seats do you want?");
		int numseat = keyboard.nextInt();//number of consecutive seats
		
		
		if(selection.equals("seat"))
		{
			System.out.println("What row do you want it to be at?");
			int row = keyboard.nextInt();//row
			
				for(int j = 0; j<10; j++)
				{
					System.out.println("You have " + numseat + "seats available at row " + row+". Would you like this seat? yes/no");
					String answer = keyboard.next();
					
					if(answer.equals("yes"))
					{
						System.out.println("Thank you for the purchase.");
						break;
					}
				}
		}
		if(selection.equals("price"))
		{
			System.out.println("How much would you pay for the seats? 10/20/30/40/50 are available.");
			int seatprice;
			seatprice = keyboard.nextInt();
			for(int q = 9; q>0; q--) //fill 10 for row 4 5 6 column 1 2
			{
				for(int j = 10; j>0; j--)
				{
					if(seats[q][j] == seatprice)
					{
						System.out.println("row " + (q+1) + " and column " + (j+1) + " is available. Would you like this seat? yes/no");
						String answer = keyboard.next();
						
						if(answer.equals("yes"))
						{
							System.out.println("Thank you for the purchase.");
							break;
						}
						if(answer.equals("no"))
						{
							break;
						}
					}
					else
					{
						System.out.println("No seats which such price available");
					}
				}
			}
		}
		if(selection.equals("finish"))
		{
			System.out.println("Thank you for using the service");
			break;
		}
		
		}
		
		
	}

}
