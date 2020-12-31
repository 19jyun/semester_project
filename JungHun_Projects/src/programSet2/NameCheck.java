package programSet2;
import java.util.Scanner;

public class NameCheck {

	public static void main(String[] args) {
	
		System.out.println("Imput Name as lowercase.");
		
		String name;
		int counter = 0;
		
		Scanner keyboard = new Scanner(System.in);
		name = keyboard.next();
		
		for (int i = 0; i < name.length(); i++)
		{
			if(name.charAt(i) == 'a')
				{
				counter++;
				if (counter == 3)
		{
			System.out.println("Lovely name");	
		}
				}
	}
	}
	
}

