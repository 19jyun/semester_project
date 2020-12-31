package programList5;

import java.util.Scanner;

public class AQIChart {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		System.out.println("What is the date today?");
		Scanner keyboard = new Scanner(System.in);
		int d = keyboard.nextInt(); // starting date
	
		int[]date = new int[31];

		System.out.println("AQI values:");
		System.out.println("INPUT AQI values. If you wish to stop, type 0.");
		
		int aqi; // AQI values to be inputed

		for(int c = 0; c<date.length; c++)
		{	
			System.out.println();
			aqi = keyboard.nextInt();// AQI values or if u wish to stop
			
			date[c] = aqi; // store AQI values to array
			
			if(aqi == 0) // if user types 0, break for loop and display result
			{
				break;
			}
			System.out.print(c+1 + "th");
			
			if(d%7 == 1) //depending on starting date, determine day
			{
				System.out.print(" mon");
			}
			if(d%7 == 2)
			{
				System.out.print(" tues");
			}
			if(d%7 == 3)
			{
				System.out.print(" wed");
			}
			if(d%7 == 4)
			{
				System.out.print(" thurs");
			}
			if(d%7 == 5)
			{
				System.out.print(" fri");
			}
			if(d%7 == 6)
			{
				System.out.print(" sat");
			}
			if(d%7 == 0)
			{
				System.out.print(" sun");
			}
			
			System.out.print(" " + aqi);
				
			if(date[c] > 300)
			{
				System.out.print(" - bad day"); // if aqi is bigger than 300, print bad day
			}
			if(date[c] <= 300)
			{
				System.out.print(" - good day"); // if aqi is smaller or equal to 300, print good day
			}
			d++;
			
		}
		System.out.println("Result out.");
		
		System.out.println();
		
		System.out.println("AQI average:");
		
		int j;
		
		for (j=1; j<date.length; j++) // add up all values
		{
			if(date[j] == 0) // once values reaches 0(break), break to loop
			{
				j--; //so that j that is added once in the beginning is subtracted
				break;
			}
			date[j] = date[j] + date[j-1]; // add up all values in array
		}
		
		double average = date[j]/j;//divide add values to how many dates there were
		
		System.out.println(average);
		
	}
}
