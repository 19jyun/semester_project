package programSet2;

public class SlotMachine {


	public static void main(String[] args) {
		
		int i = 0;
		int x;
		int y;
		int z;
		
		
		for(i = 0; i<5; i++)
		{
			x = (int)(Math.random()*10);
			y = (int)(Math.random()*10);
			z = (int)(Math.random()*10);
			
			System.out.println(x + " " + y + " " + z);

		if (x == 7 && y == 7 && z == 7)
		{
			System.out.println("WIN!");
		}
		else
		{
			System.out.println("LOSS");
		}
		}
		
	}

}
