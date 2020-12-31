package defaultPackage;

import java.util.Random;

/**
 * 
 * @author 19jyun
 *@date Sep 2017
 *@purpose Array code
 */

public class ArrayManipulation {

	public static void main(String[] args) {
		
		int numArray[] = new int [10];
		
		numArray[3] = 67; //store an int in position #3
		Random generator = new Random();
		
		//fill the array with random values
		for (int i = 0; i<numArray.length; i = i+2)
		{
			numArray[i] = generator.nextInt(100);
		}
		
		//display the array
		for (int i = 0; i < numArray.length; i++)
		{
			System.out.print(numArray[i] + " ");
		}

	}

}
