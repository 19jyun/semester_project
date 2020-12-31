package programSet2;
import java.util.Scanner;

public class EmailAddress {

	public static void main(String[] args) {
		
		System.out.println("Type first name, last name, graduation year");
		
		int y;
		String lastname;
		String firstname;
		
		Scanner keyboard = new Scanner(System.in);
		lastname = keyboard.next();
		firstname = keyboard.next();
		y = keyboard.nextInt();
		
		int x = y%100;
		char l = lastname.charAt(0);
		char f = firstname.charAt(0);
		
		System.out.println(x + l + f + "@aes.ac.in");
	}

}
