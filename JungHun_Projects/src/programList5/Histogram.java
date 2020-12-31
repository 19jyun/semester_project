package programList5;

public class Histogram {

	/**
	 * @param args
	 * @ Populate an array with 20 random values 1 ~ 50
	 * @ 1 - 10  --> ****** / 11 - 20 --> ** / 21 - 30 / 31 - 40 --> * / 41 - 50 --> ***
	 * @ HL = create histogram 2 --> # = 5 *'s
	 */
	
	private static int[]numArray = new int[100];
	
	static int a = 0;
	static int b = 0;
	static int c = 0;
	static int d = 0;
	static int e = 0;
	
	public static void main(String[] args) 
	{
		// populate an array with 100 values
		for (int i=0; i<100; i++)
		{
			numArray[i] = (int)(Math.random()*50);			
		}
		
		displayArray(numArray);
		
		histogram1(numArray);
		
		histogram2(numArray);
	}
	
	
	//method to display the contents
		public static void displayArray(int[]anArray)
		{
			for (int j=0; j<anArray.length; j++)
			{
				System.out.print(anArray[j]+ " ");
			}
		}
		
	//method for histogram 1
	public static void histogram1(int []numArray)
	{
		for (int i = 0; i < numArray.length; i++)
		{
		if (numArray[i]/10 == 0)
		{
			a++;
		}
		else if (numArray[i]/10 == 1)
		{
			b++;
		}
		else if (numArray[i]/10 == 2)
		{
			c++;
		}
		else if (numArray[i]/10 == 3)
		{
			d++;
		}
		else if (numArray[i]/10 == 4)
		{
			e++;
		}
		}	
		
		System.out.println("");
		System.out.print("01 - 10 | ");
		for (int i=0; i<a; i++)
		{
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("11 - 20 | ");
		for (int i=0; i<b; i++)
		{	
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("21 - 30 | ");
		for (int i=0; i<c; i++)
		{	
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("31 - 40 | ");
		for (int i=0; i<d; i++)
		{	
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("41 - 50 | ");
		for (int i=0; i<e; i++)
		{	
			System.out.print("*");
		}
	}
	
	//Histogram 2
	public static void histogram2(int []numArray)
	{
		System.out.println();
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int c5 = 0;
		
		
		while (a>=5)
		{
			a = a - 5;
			c1++;
		}
		System.out.println("");
		System.out.print("01 - 10 | ");
		for (int i=0; i<c1; i++)
		{	
			System.out.print("#");
		}
		for (int i=0; i<a; i++)
		{
			System.out.print("*");
		}
		
		while (b>=5)
		{
			b = b - 5;
			c2++;
		}
		System.out.println("");
		System.out.print("11 - 20 | ");
		for (int i=0; i<c2; i++)
		{	
			System.out.print("#");
		}
		for (int i=0; i<b; i++)
		{	
			System.out.print("*");
		}
		
		while (c>=5)
		{
			c = c - 5;
			c3++;
		}
		System.out.println("");
		System.out.print("21 - 30 | ");
		for (int i=0; i<c3; i++)
		{	
			System.out.print("#");
		}
		for (int i=0; i<c; i++)
		{	
			System.out.print("*");
		}
		
		while (d>=5)
		{
			d = d - 5;
			c4++;
		}
		System.out.println("");
		System.out.print("31 - 40 | ");
		for (int i=0; i<c4; i++)
		{	
			System.out.print("#");
		}
		for (int i=0; i<d; i++)
		{	
			System.out.print("*");
		}
		while (e>=5)
		{
			e = e - 5;
			c5++;
		}
		System.out.println("");
		System.out.print("41 - 50 | ");
		for (int i=0; i<c5; i++)
		{	
			System.out.print("#");
		}
		for (int i=0; i<e; i++)
		{	
			System.out.print("*");
		}
	}
	
	//histogram revision
	public static void histogramRevision(int []numArray)
	{
		int start;
		int end;
		
		for (int i = 0; i < 5; i++)
		{
			start = 10*i+1;
			end = start + 9;
			
			System.out.print(start + " - " + end + "| ");
			
			for(int j = 0; j < numArray.length; j++)
			{
				if(numArray[j]>= start && numArray[j]<= end)
				{
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
	}
}
