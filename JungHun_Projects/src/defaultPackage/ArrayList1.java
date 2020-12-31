package defaultPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String> ();
		ArrayList <Double> scoreList = new ArrayList<Double>();
		
		boolean done = false;
		String nm = " ";
		
		//set up a continuous loop
		while(done == false)
		{
			System.out.println("Type a name");
			nm = keyboard.next();
			System.out.println("type the score");
			double scor = keyboard.nextDouble();
			
			nameList.add(nm);
			scoreList.add(scor);
			
			System.out.println("continue y/n");
			String cont = keyboard.next();
			
			if(cont.equals("n"))
			{
				done = true;
			}
			
			System.out.print(nameList + "\t");
			System.out.println();
			System.out.print(scoreList + "\t");
		}
	}

}
