package encryption;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DecryptorTest {
	
public static void main(String[] args)
	
	{
		System.out.println("Decryption Program using a numeric key"); 
		Scanner keyboard = new Scanner(System.in);
		
		try
		{
			System.out.println("type a numeric decrypt key");
			int keyToEncrypt = keyboard.nextInt();
			//dialog box for reading
			JFileChooser chooser= new JFileChooser();
			if(chooser.showOpenDialog(null)!= JFileChooser.APPROVE_OPTION)
					System.exit(0);
			FileReader inFile= new FileReader(chooser.getSelectedFile());
			
			//dialog box for saving
			if(chooser.showSaveDialog(null)!= JFileChooser.APPROVE_OPTION)
					System.exit(0);
			FileWriter outFile= new FileWriter(chooser.getSelectedFile());
						
			Decryptor crypt= new Decryptor(keyToEncrypt);
			
			crypt.decryptFile(inFile,outFile);
			
			System.out.println("decryption completed....");
			
			
			//crypt.decryptFile(outFile, inFile);
			
		}
		catch (InputMismatchException exception)
		{
			System.out.println("key must be an integer: " + exception);
		}
		catch (IOException e)
		{
			System.out.println ("Error processing file: " + e);
		}
	}

}
