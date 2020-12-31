package programList6;

public class TransposeMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int [][] numArray = new int[3][4];
		int [][] arrayNum = new int[4][3];
		
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<4; j++)
			{
				numArray[i][j] = (int)(Math.random()*49)+1;
				
				System.out.print("\t" + numArray[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i<4; i++)
		{
			for(int j = 0; j<3; j++)
			{
				arrayNum[i][j] = numArray[j][i];
				
				System.out.print("\t" + arrayNum[i][j]);
			}
			System.out.println();
		}
			
	}

}
