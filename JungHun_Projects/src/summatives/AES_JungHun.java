package summatives;

import java.util.ArrayList;
import summatives.Event_JungHun;

public class AES_JungHun {

	/**
	 *@author 19jyun
	 *@date January 19
	 *@purpose summative project: ArrayList
	 */

	private static ArrayList <Event_JungHun> eventList = new ArrayList<Event_JungHun> ();
	private static ArrayList <Event_JungHun> noonList = new ArrayList<Event_JungHun> ();


	public static void main(String[] args) 
	{
		Event_JungHun s = new Event_JungHun ("Science Games", "morning", 25); //declaring object
		Event_JungHun m = new Event_JungHun ("Math Magic", "morning", 20);
		Event_JungHun v = new Event_JungHun ("Video Editing", "noon", 10);
		Event_JungHun t = new Event_JungHun ("Tug-of-war", "noon", 40);
		Event_JungHun c = new Event_JungHun ("Code wars", "morning", 12);

		eventList.add(s); //adding events to the event list
		eventList.add(m);
		eventList.add(v);
		eventList.add(t);
		eventList.add(c);


		System.out.println("List of events: ");
		for(int i = 0; i<eventList.size(); i++) //display the names of events
		{
			System.out.println(eventList.get(i).getName());
		}

		eventList.set(0, new Event_JungHun ("CS Games", "morning", 25));//changing the first event in array list to cs games
		eventList.remove(1);//removing second event from event list

		System.out.println();
		System.out.println("Current list of events : ");

		for(int i=0; i<eventList.size(); i++)//display names of events in current list
		{
			System.out.println(eventList.get(i).getName());
		}
		System.out.println("Number of events: " + eventList.size());//display the number of events

		Event_JungHun te = new Event_JungHun ("Tart eating", "noon", 16);//creating new event tart eating

		eventList.add(2, te);//adding new object to event list before tug of war

		System.out.println();
		System.out.println("Current order of events after adding tart eating: ");

		for(int i = 0; i<eventList.size(); i++)
		{
			System.out.println(eventList.get(i).getName());
		}

		displayMoreThan20();//calling method to display events with more than 20 participants

		System.out.println();
		System.out.println("Name of events with reverse order: ");

		reverseOrder();//calling method to display events with reverse order

		for(int i = 0; i< eventList.size(); i++)
		{
			if(eventList.get(i).getTime().equals("noon"))
			{
				noonList.add(eventList.get(i));
				eventList.remove(i);
				i--;
			}
		}

		System.out.println();
		System.out.println("Name of events for EventList: ");

		for(int i = 0; i<eventList.size(); i++)
		{
			System.out.println(eventList.get(i).getName() + " " + eventList.get(i).getTime() + " " + eventList.get(i).getNop());
		}

		System.out.println();
		System.out.println("Name of events for NoonList: ");

		for(int i = 0; i<noonList.size(); i++)
		{
			System.out.println(noonList.get(i).getName() + " " + noonList.get(i).getTime() + " " + noonList.get(i).getNop());
		}
	}

	private static void displayMoreThan20()
	{
		System.out.println();
		System.out.println("Name of events with more than 20 articipants: ");

		for(int i = 0; i < eventList.size(); i++)
		{
			if(eventList.get(i).getNop()>20)
			{
				System.out.println(eventList.get(i).getName());
			}
		}
	}

	private static void reverseOrder()
	{
		for(int i = 1; i<=eventList.size(); i++)
		{
			System.out.println(eventList.get(eventList.size()-i).getName());
		}
	}
}
