package programSet1;
import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) 
	{
		System.out.println("Guess my Number!(It's between 1 and 20!");
		
		int n1;
		int x = 17;
		
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		
		if(n1==x)
		{
			System.out.println("Correct!");
		}
		else
		{
			System.out.println("Are you even trying.");
		}
	}

}
