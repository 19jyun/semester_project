package programSet4;

import java.util.Scanner;

public class alternatingSum {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many numbers will you input?");
		
		int z = keyboard.nextInt();
		
		System.out.println("Input numbers that you wish to compute.");
		
		int m = 0;
		int i;
		int a = z;
		int n;
		int [] array = new int[a];
		int [] array2 = new int[a];
		int [] array3 = new int[a];
		
		for(i = 1; i<=a; i++)
		{
		
			m++;
			
			n = keyboard.nextInt();
			
			if (n==0)
			{
				i = a;
			}
			else
			{
			array[m] = n;
			}
			
			for(int q = 1; q<=i/2; q++)
			{
				if (i%2 == 0)
				{
					array2[q] = -array[m];
				}
				if (i%2 == 1)
				{
					array3[q] = array[m];
				}
			}	
		}
		
		System.out.print(array3[i] + array2[i]);
	}

}
