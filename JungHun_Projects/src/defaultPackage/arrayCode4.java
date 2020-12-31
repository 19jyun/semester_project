package defaultPackage;

public class arrayCode4 {

	public static void main(String[] args) 
	{
		int [] numArray = new int[10];
		int [] numArray2 = new int[10];
		int x= 0;
		
		for(int i=0; i < numArray.length; i++)
		{
			numArray[i] = (int)(Math.random()*50);
		}
		
		for (int i = 0; i<numArray.length; i++)
		{
			System.out.print(numArray[i] + " ");
		}

		for (int i = 0; i<numArray.length; i++)
		{
			if (numArray[i]<20)
			{
				numArray2[x] = numArray[i];
				x++;
			}
		}
		System.out.println();
		
		//display numArray2
		for (int i = 0; i< numArray2.length; i++)
		{
				System.out.print(numArray2[i] + " ");
			}
		}
		}
