package programSet2;

import java.util.Scanner;

public class KidToAdd {

	public static void main(String[] args) {
		
		System.out.println("Input first Name, then last name.");
		
		String fn;
		String ln;
		int i = 0;
		int z;
		int q = 0;
		
		Scanner keyboard = new Scanner(System.in);
		fn = keyboard.next();
		ln = keyboard.next();
		
		for(i=0; i<5; i++)
		{
		int r = (int)(Math.random()*10);
		int s = (int)(Math.random()*10);
		
		System.out.println(r + " " + s);
		System.out.println("Add these numbers!");
		
		z = keyboard.nextInt();
		
		int k = r + s;
		
		if(z == k)
		{
			q++;
		}
		if(z != k)
		{
			q = q + 0;
		}
		}
		System.out.println(fn + " " + ln);
		System.out.println(q);
		
	}

}
