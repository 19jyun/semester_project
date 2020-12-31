package programSet3;

public class Pg258 {

	public static void main(String[] args) 
	{
		// pattern 1
		
		for (int i = 1; i <= 3; i++) 
		{
			for (int j = 1; j <= 4; j++) 
			{
			System.out.print("*");
			}
			System.out.println(); 
		}
		
		// pattern 2
		
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= 3; j++) 
			{
			System.out.print("*");
			}
			System.out.println(); 
		
		// pattern 3
	
		System.out.println("pattern 3 \n");
		
		for (int row = 0; row <4; row++)
		{
			for (int col = 0; col < row+1; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// pattern 4
		
		System.out.println("pattern 4 \n");
		
		for (int a = 1; a <= 3; a++) 
		{
			for (int j = 1; j <= 5; j++) 
			{
				if (j % 2 == 0) 
				{
				System.out.print("*");
				}
				else
				{
				System.out.print("-");
				}
				
			System.out.println();
			}
	}
	}
	}
}

