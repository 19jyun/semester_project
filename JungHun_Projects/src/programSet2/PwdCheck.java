package programSet2;
import java.util.Scanner;

public class PwdCheck {

	public static void main(String[] args) {
		
		System.out.println("Type in the password.");
		
		String password;
		password = "AESHS";
		String x;
		
		Scanner keyboard = new Scanner(System.in);
		x = keyboard.next();
		
		if(password.equals(x))
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Wrong");
		}
	}
}

