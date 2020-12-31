package programSet4;

public class DieSequence {

	public static void main(String[] args) 
	{
	
		int num[] = new int[20];
		int i;
		int r;
		
		
		for(i = 0; i < 20; i++)
		{
		r = 1 + (int)(Math.random()*6);
		
		num[i] = r;
		
		System.out.print(num[i] + " ");
		}

		

	}

}
