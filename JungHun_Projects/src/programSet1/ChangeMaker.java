package programSet1;
import java.util.Scanner;

/**
 * 
 */

public class ChangeMaker {

	public static void main(String[] args) 
	{
		int n1;
	
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		
		System.out.println("quarter = " + n1/25);
		System.out.println("dime = " + n1%25/10);
		System.out.println("nickel = " + n1%25%10/5);
		System.out.println("pennies = " + n1%25%10%5);
	}

}
