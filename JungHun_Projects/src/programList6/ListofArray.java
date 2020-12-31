package programList6;

import java.util.ArrayList;

public class ListofArray {

	public static void main(String[] args) 
	{
	
		ArrayList<String> wordList1 = new ArrayList <String> ();//if want to write something else, use Int, Boolean, etc.
		
		wordList1.add("the");
		wordList1.add("end");
		wordList1.add("of");
		wordList1.add("the");
		wordList1.add("world");
		wordList1.remove(1);//removing what's in the index position of 1 in the string array
		wordList1.add(1,"beginning");// adding "beginning" to index position 1
		System.out.println(wordList1);
		
		int i = wordList1.size();
		
		System.out.println("Number of the words = " + i);
		
		String temp = wordList1.get(4);// at index position 4
		
		System.out.print(temp);
		
		wordList1.set(2, "could");//replaces index position 2 with could
		System.out.println();
		
		//(name of arraylist).size(); --> returns the number of items in the current list
		// (name of arraylist).add(n,"object); --> adds an object and increases the size by pushing everything behind the index position
		
		System.out.println(wordList1);
		
	}

}