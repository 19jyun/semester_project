package programSet1;
import java.util.Scanner;

public class GuessNumGameEzMediumHard {

	public static void main(String[] args) 
	{
		System.out.println("Guess my Number! It's between 1 and 20!");
		System.out.println("Difficulty:");
		System.out.println("1. Easy");
		System.out.println("2. Medium");
		System.out.println("3. Hard");
		
		int n1;
		int x = 11;
		
		Scanner keyboard = new Scanner(System.in);
		
		for(n1=1; n1!=11; n1=n1++)
		{
			n1 = keyboard.nextInt();
			if(n1==x)
			{
				System.out.println("Correct!");
			}
			else if(n1>11)
			{
				System.out.println("High");
			}
			else if(n1<11)
			{
				System.out.println("Low");
			}
		}
	}
}