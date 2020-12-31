package programList5;

public class BubbleSort {

	/**
	 * @param args
	 */
	private static int[]numArray = new int[20];
	
	public static void main(String[] args) 
	{
		for (int i=0; i<20; i++)
		{
			numArray[i] = (int)(Math.random()*50);
			
		}
		
		displayArray(numArray);
		
		int k = numArray.length;
		
		for (k = numArray.length; numArray.length > 0; k--)
		{
			for(int i=0; i<k; i++)
			{
				if (numArray[i] > numArray[i+1])
				{
					numArray[i] = numArray[i] + numArray[i+1];
					numArray[i+1] = numArray[i] - numArray[i+1];
					numArray[i] = numArray[i] - numArray[i+1];		
				}
				else
				{
				}
			}
		}
		
	}
		
		public static void displayArray(int[]anArray)
		{
			for (int j=0; j<anArray.length; j++)
			{
				System.out.print(anArray[j]+ " ");
		}
		
	
	}

}
