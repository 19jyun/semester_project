package programSet1;
	
public class NestedLoops_Example {

	public static void main(String[] args) 
	{
		// pattern 1
		/*
		for (int row = 0; row < 5; row++)
		{
			for (int col = 0; col < 6; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// pattern 2
		/*
		System.out.println("pattern 2 \n");
		
		for (int row = 0; row <5; row++)
		{
			for (int col = 0; col < row+1; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/

		// pattern 3
		
		System.out.println("pattern 3 \n");
		
		int n = 1;
		
		for (int row = 0; row < 4; row++)
		{
			for (int col = 0; col<5; col++)
			{
				System.out.print(n);
			}
			n++;
			System.out.println();
		}
		
		// pattern 4
		/*
		System.out.println("pattern 4 \n");
		
		int n;
		
		for (int row = 0; row < 3; row++)
		{
			for (n = 1; n < 6; n++)
			{
				System.out.print(n);
			}
				System.out.println();
			
		}
		*/
		
		// pattern 5
		
		System.out.println("pattern 5 \n");
		
		for (int row = 4; row > 0; row = row - 1)
		{
			for (int col = 0; col < row*2; col = col + 2)
			{
				System.out.print("**");
			}
			System.out.println();
		}
		
	}

}
