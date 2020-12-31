package programSet1;
import java.util.Scanner;

public class MenuChoice {

	
	public static void main(String[] args) 
	{
		System.out.println("1.Hamburger");
		System.out.println("2.Chicken");
		System.out.println("3.Sausage");
		System.out.println("4.Pizza");
		System.out.println("5.Pasta");
		
		int n1;
		
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		
		if(n1==1)
		{
			System.out.println("$10");
		}
		else if(n1==2)
		{
			System.out.println("$8");
		}
		else if(n1==3)
		{
			System.out.println("$5");
		}
		else if(n1==4)
		{
			System.out.println("$19.99");
		}
		else if(n1==5)
		{
			System.out.println("$12.99");
		}

	}

}
