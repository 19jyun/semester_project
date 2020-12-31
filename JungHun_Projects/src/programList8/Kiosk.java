package programList8;

import java.io.FileInputStream;
import java.util.ArrayList;

import programList7.Student;

public class Kiosk {

	private static ArrayList <Food> foodList = new ArrayList<Food> ();
	private static ArrayList <Food> moreThan100 = new ArrayList<Food> ();
	private static ArrayList <Food> drinksList = new ArrayList<Food> ();

	public static void main(String[] args) 
	{
		Food s = new Food ("Sandwich", 120, "lunch");		
		Food a = new Food("apple", 50, "snack");
		Food b = new Food("banana", 60, "snack");
		Food c = new Food("coke", 90, "drink");
		Food co = new Food("coffe", 150, "drink");

		foodList.add(s);
		foodList.add(a);
		foodList.add(b);
		foodList.add(c);
		foodList.add(co);

		for(int i = 0; i<foodList.size(); i++)
		{
			System.out.println(foodList.get(i).getName() + " " + foodList.get(i).getPrice() + " " + foodList.get(i).getType());
		}

		moreThan100();

		System.out.println();
		System.out.println("List of items expensive than 100 rs: ");

		for(int i = 0; i<moreThan100.size(); i++)
		{
			System.out.println(moreThan100.get(i).getName() + " " + moreThan100.get(i).getPrice() + " " + moreThan100.get(i).getType());
		}

		drinksList();

		System.out.println();
		System.out.println("List of drinks: ");

		for(int i = 0; i<drinksList.size(); i++)
		{
			System.out.println(drinksList.get(i).getName() + " " + drinksList.get(i).getPrice() + " " + drinksList.get(i).getType());
		}


	}

	private static void moreThan100 ()
	{
		for(int i = 0;i<foodList.size(); i++)
		{
			if(foodList.get(i).getPrice() > 100)
			{
				moreThan100.add(foodList.get(i));
			}
		}
	}

	private static void drinksList()
	{
		for(int i = 0;i<foodList.size(); i++)
		{
			if(foodList.get(i).getType().equals("drink"))
			{
				drinksList.add(foodList.get(i));
			}
		}
	}

}
