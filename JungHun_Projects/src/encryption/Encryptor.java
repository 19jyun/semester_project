package encryption;

import java.io.*;
import java.util.Scanner;

public class Encryptor {

	/*constructs a new object
	 * @param aKey - numeric value for encryption
	 */
	public Encryptor (int aKey) 
	{	
		key=aKey;
	}
	
	/*method to perform encryption
	 *@param inFile - raw data file to be encrypt
	 *@param outFile - file to which encrypted data is stored
	 *@precondition: must know the file to encrypt
	 *@post-condition:save encrypted data to specified file.
	*/	
	public void encryptFile(FileReader inFile, FileWriter outFile)	throws IOException
	{
		
			Scanner in=new Scanner(inFile);
			PrintWriter out= new PrintWriter(outFile);
			String newLine, encryptedLine="";
			
			while (in.hasNextLine())
			{
				newLine = in.nextLine();
				for (int i=0; i<newLine.length();i++)
				{
					int x = (int)newLine.charAt(i)+key;
					char ch = (char) x;
					encryptedLine = encryptedLine+ch;
				}
				out.println(encryptedLine);
				encryptedLine = "";
				
			}
			out.close();
				
	}
	
	public void decryptFile(FileReader inFile, FileWriter outFile)	throws IOException
	{
		
			Scanner in=new Scanner(inFile);
			PrintWriter out= new PrintWriter(outFile);
			String newLine, encryptedLine="";
			
			while (in.hasNextLine())
			{
				newLine = in.nextLine();
				for (int i=0; i<newLine.length();i++)
				{
					int x = (int)newLine.charAt(i)-key;
					char ch = (char) x;
					encryptedLine = encryptedLine+ch;
				}
				out.println(encryptedLine);
				encryptedLine = "";
				
			}
			out.close();
				
	}
	
	//---------decryptFile--------------
	//write your method here
					
	private int key;
	
}
