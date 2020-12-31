/**
 * 
 */
package programList5;

import java.util.Scanner;

/**
 * @author 19jyun
 * @date Nov 2nd
 * @purpose study multiple methods
 */
public class SearchSort {
	
	static int q;

	private static int[]numArray = new int[20];
	
	public static void main(String[] args) 
	{
		//populate the array with random values
		for (int i=0; i<20; i++)
		{
			numArray[i] = (int)(Math.random()*50);			
		}
		
		displayArray(numArray);//call displayArray method
		Scanner keyboard = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter target value");
		int target = keyboard.nextInt();
		
		int indexValue = linearSearch(numArray, target);//call linearSearch method and grab the value in index
		
		if (indexValue == -1)
		{
			System.out.println(target + " is not found.");
		}
		
		else
		{
		System.out.println(target + "found at " + (indexValue+1));
		}
		
		bubblesort(numArray);
		
		System.out.println(numArray[19]);
		
		System.out.println();
		System.out.print("Array after bubblesort");
		System.out.println();
		

		displayArray(numArray);
		
		selectionSort(numArray);
		
		System.out.println();
		System.out.print("Array after selectionsort");
		System.out.println();
		
		displayArray(numArray);
	
		
		binarySearch(numArray);
		
	}
		//method to display the contents
		public static void displayArray(int[]anArray)
		{
			for (int j=0; j<anArray.length; j++)
				System.out.print(anArray[j]+ " ");
		}

		//method to search for a target value
		public static int linearSearch(int []anArray, int target)
		{
			for(int i = 0; i<numArray.length; i++)
			{
				if(anArray[i] == target)
				{
					return i;
				}
			}
			
			return -1;
		}
		
		//bubblesort
		public static void bubblesort(int[]onArray)
		{
			
		for(int k = numArray.length; k>0; k--)
		{
			for(q = 0; q < k - 1; q++)
			{
			if (numArray[q] < numArray[q+1])
			{
				numArray[q] = numArray[q] + numArray[q+1];
				numArray[q+1] = numArray[q] - numArray[q+1];
				numArray[q] = numArray[q] - numArray[q+1];		
			}
			}
		}
	}
		//selectionSort
		public static void selectionSort(int[]anArray)
		{
			
			int i = 0;
			int j=0;
			for(i=0; i<numArray.length-1; i++){
				int index = i;
				for(j = i + 1; j<numArray.length; j++)
				{
					if (numArray[j] < numArray[index]) 
						{index = j;}
				}
				int temp = numArray[index];
				numArray[index] = numArray[i];
				numArray[i] = temp;
			}
			
		}
		//binary search
		public static void binarySearch(int[]anArray)
		{		
			System.out.println();
			System.out.println("enter a target value");
			Scanner keyboard = new Scanner(System.in);
			int tv = keyboard.nextInt();//value to search
			
			int mid;
			int s = 0;
			int e = numArray.length;
			
			int iter = 0;
			
			while(s < e)
			{
			iter++;
			mid = (s+e)/2;
			
			if (numArray[mid] == tv)
			{
				System.out.println("found at ");
				System.out.print(mid);
				break;
			}
			if (numArray[mid] > tv)
			{
				e = mid - 1;
			}
			if (numArray[mid] < tv)
			{
				s = mid + 1;
			}
			}
			System.out.println();
			System.out.println("This loop has been executed " + iter + " times.");
		}
}

