package programSet1;

import java.util.Scanner;


public class EggBasket {

	public static void main(String[] args) 
	{
		System.out.println("Type in the number of eggs and price of each egg");
		int n1, n2;
		
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		
		System.out.println(n1*n2);
	}

}
