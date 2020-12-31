package encryption;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EncryptorTest {
	
public static void main(String[] args)
	
	{
		System.out.println("Encryption Program using a numeric key"); 
		Scanner keyboard = new Scanner(System.in);
		
		try
		{
			System.out.println("type a numeric encrypt key");
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
						
			Encryptor crypt= new Encryptor(keyToEncrypt);
			
			crypt.encryptFile(inFile,outFile);
			
			System.out.println("encryption completed....");
			
			
			//crypt.decryptFile(outFile, inFile);
			crypt.decryptFile(inFile, outFile);
			
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
