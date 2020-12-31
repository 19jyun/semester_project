package programList6;

public class LowHigh {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int [][] numArray = new int [5][4];
		
		for(int i= 0; i<5; i++)
		{
			for(int j = 0; j<4;j++)
			{
				int random = (int)(Math.random()*40)+10;					
				numArray[i][j] = random;
				
				System.out.print("\t" + numArray[i][j]);
			}
			System.out.println();
		}
		
		char[][]LHArray = new char [5][4];//declare char array
		System.out.println();
		
		for(int i= 0; i<5; i++)
		{
			for(int j = 0; j<4;j++)
			{
				if(numArray[i][j] <= 25)
				{
					LHArray[i][j] = 'L';
				}
				else
				{
					LHArray[i][j] = 'H';
				}
				System.out.print("\t" + LHArray[i][j]);
			}
			System.out.println();
		}

	}

}
