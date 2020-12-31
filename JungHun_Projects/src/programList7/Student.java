package programList7;

import java.io.Serializable;

public class Student implements Serializable{

	//instance variables
	
	private String name;
	private int age;
	
	//constructor
	
	public Student (String nm, int a)
	{
		this.name = nm;
		this.age = a;
	}
	
	//getters
	
	public String getName ()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	//setters or mutators
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	

}
