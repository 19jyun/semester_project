package programList7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class HighSchool {

	private static ArrayList <Student> studentList = new ArrayList<Student> ();
	private static ArrayList <Student> seniorList = new ArrayList<Student> ();
	private static ArrayList <Faculty_new> facultyList = new ArrayList<Faculty_new> ();
	private static ArrayList <Staff> staffList = new ArrayList<Staff> ();
	
	
	public static void main(String[] args) throws ClassNotFoundException
	{
	
		/*
	studentList = readListToFile();
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Type in your name and age for two students");
	for (int c = 0; c<2; c++)
	{
		Student s = new Student(keyboard.next(), keyboard.nextInt());
		studentList.add(s);
	}
	
	System.out.println("Student List");
	
	//display student names
	for (int i = 0; i<studentList.size(); i++)
	{
		System.out.println(studentList.get(i).getName() + " " + studentList.get(i).getAge());
	}
	
	//create senior list method
	
	creatSeniorList();

	System.out.println("Senior List");
	
	//display senior list
	
	for (int i = 0; i<seniorList.size(); i++)
	{
		System.out.println(seniorList.get(i).getName() + " " + seniorList.get(i).getAge());
	}
	
	saveListToFile(studentList);
	
	
	//create two faculty objects and add to faculty list

		int[] f1_periods = {1,1,0,0,1,1,1,0};
		int[] f2_periods = {0,1,0,0,1,1,1,1};
		Faculty_new f1 = new Faculty_new("Jain", f1_periods);
		Faculty_new f2 = new Faculty_new("Garg", f2_periods);
		
		facultyList.add(f1);
		facultyList.add(f2);
		
		for(int i = 0; i<facultyList.size(); i++)
		{
			//display name and free period
			System.out.println(facultyList.get(i).getName());
			
			for(int p = 0; p<8; p++)
			if(i == 0)
			{
			if(f1_periods[p] == 0)
			{
				System.out.println("period " + (p+1) + "\t");
			}
			}
	
			if (i==1)	{
				for(int p = 0; p<8; p++)
			if(f2_periods[p] == 0)				
			{
				System.out.println("period " + (p+1) + "\t");
			} 
			}	
			}
		
		*/
		
		Staff n1 = new Staff("Noval", 01);
		Staff n2 = new Staff("Gopal", 02);
		
		staffList.add(n1);
		staffList.add(n2);
		
		//display name of staff with id value = 02
		
		for(int i = 0; i<staffList.size(); i++)
		{
			if(staffList.get(i).getId() == 2)
			{
				System.out.println(staffList.get(i).getName());
			}
		}
			
			
		
		}
	
	 public static void creatSeniorList()
	  {
	  for(int i =0; i<studentList.size();i++)
	  {
		  if(studentList.get(i).getAge()>17)
		  {
			  seniorList.add(studentList.get(i));
			  studentList.remove(i);
			  i--;
		  }
	  }
		
	}
	 
	 public static void saveListToFile(ArrayList studentList)
	 {
		 //save student list to file
		 try{
			 ObjectOutputStream out = new ObjectOutputStream
					 (new FileOutputStream("sList.dat"));
			 out.writeObject(studentList);
			 out.close();
		 }catch (IOException e)
			 {e.printStackTrace();}
			 
	 }
	 
	 
	 //method to read file and create the list
	 public static ArrayList readListToFile() throws ClassNotFoundException
	 {
		 //save student list to file
		 try{
			 ObjectInputStream in = new ObjectInputStream
					 (new FileInputStream("sList.dat"));
			studentList = (ArrayList<Student>) 
			in.readObject();
			 in.close();
		 }catch (IOException e)
			 {e.printStackTrace();}
		 return studentList;
			 
	 }
}
