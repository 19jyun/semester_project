package programSet2;


public class Dice {

	public static void main(String[] args) {

		int trials = 0;
		int q = 0;
		
		for (trials = 0; trials < 5; trials++)
		{
			int r = 1 + (int)(Math.random()*6);
			
			if(r == 6)
			{ 
				q = q + 1;
			}
		}
		System.out.println(q);
	}

}
