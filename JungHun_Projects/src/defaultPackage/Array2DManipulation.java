package defaultPackage;

public class Array2DManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int [][] numArray = new int[2][3]; 
		int j = 0;
		
		for (int i=0; i<numArray.length; i++)
		{
			for (j=0; j<numArray[0].length; j++)
			{
				numArray[i][j] = (int)(Math.random()*10)+1;		
				
				
			}		
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0; i<numArray.length; i++) // add all values by 4
		{
			for (j=0; j<numArray[0].length; j++)
			{
				numArray[i][j] = numArray[i][j] - 4;		
				
				System.out.print(numArray[i][j] + " ");
			}		
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0; i<numArray.length; i++) // double first row
		{
			for (j=0; j<numArray[0].length; j++)
			{
				numArray[i][0] = numArray[i][0]*2;		
				
				System.out.print(numArray[i][j] + " ");
			}		
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0; i<numArray.length; i++) // print values bigger than 5
		{
			for (j=0; j<numArray[0].length; j++)
			{		
				if(numArray[i][j] > 5)
				{
					System.out.print(numArray[i][j]);
				}
			}
			System.out.println();
		}
		
		char [][]mS = new char[4][4]; // declare 4X4 char array
		
		//fill with "*"
		for(int r = 0; r<mS.length; r++)
		{
			for(int c = 0; c<mS[0].length; c++)
			{
				mS[r][c] = '*';
				
				System.out.print(mS[r][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int q = 0; q<3; q++)
		{
		int i = (int)(Math.random()*3)+1;
		int o = (int)(Math.random()*3)+1;
		
		mS[i][o] = 'b';
		}
		
		for(int r = 0; r<mS.length; r++)
		{
			for(int c = 0; c<mS[0].length; c++)
			{	
				System.out.print(mS[r][c] + " ");
			}
			System.out.println();
		}
		
	}
}


